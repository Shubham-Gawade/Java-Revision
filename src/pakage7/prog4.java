//Singleton Class -> You can create only one object of that class

package pakage7;

public class prog4 {

	public static void main(String[] args) 
	{	
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				Abcd obj1=Abcd.getInstance();
				System.out.println(obj1);
			}
		});
		
		Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				Abcd obj2=Abcd.getInstance();
				System.out.println(obj2);
			}
		});
	
		// Its used when you use syncronized 		
		//t1.start();
		//t2.start();
		
		// Its used when you not use syncronized
		t1.start();
		try {
			Thread.sleep(10);
		}
		catch(Exception e) {}
		t2.start();
	}
}

class Abcd
{
	public static Abcd obj;  //Bcoz getInstance is static method and its returning static object
	int i;
	private Abcd()
	{
		System.out.println("Instance Created");
	}
	
//	public static synchronized Abcd getInstance()  //If we use syncronized here then its increases the execution time
//	{
//		//obj=new Abcd();  //If we do this then we will get 2 different objects
//		
//		if(obj == null)
//		{
//			obj=new Abcd();
//		}
//		return obj;
//	}
	
	public static Abcd getInstance() //Double check Locking
	{
		//obj=new Abcd();  //If we do this then we will get 2 different objects
		
		if(obj == null)
		{
			obj=new Abcd();
		}
		return obj;
	}
}
