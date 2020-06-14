//Multithreading Runnable Interface

package Pakage5;

public class prog7 {

	public static void main(String[] args) 
	{
		A1 obj1=new A1();
		Thread t1=new Thread(obj1);
		t1.start();
		
		Runnable r=new Runnable() {
			
			@Override
			public void run() {
				
				for(int i=0;i<=5;i++)
				{
					System.out.println("Hello");
					try
					{
						Thread.sleep(1000);
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
				}	
			}
		};
		
		Thread t2=new Thread(r);
		t2.start();
	}
}

class A1 implements Runnable
{
	public void show()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("Hiii");
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
	public void run()
	{
		show();
	}
}