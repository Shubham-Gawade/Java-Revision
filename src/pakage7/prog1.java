//Enum

package pakage7;

//enum Mobile  //We can create enum outside the class
//{
//	APPLE,SAMSUNG,HTC;
//}

//class Mobile  //In bckend,compiler creates a class like this
//{
//	static final Mobile APPLE=new Mobile();
//	static final Mobile SAMSUNG=new Mobile();
//	static final Mobile HTC=new Mobile();
//}

public class prog1 {

	enum Mobile
	{
		APPLE(1000),SAMSUNG(2000),HTC(3000);
		
		int price;
		
	    Mobile(int a) 
	    {
			price=a;
			System.out.println("Constructor");
		}
		
		public int getPrice()
		{
			return price;
		}
	}
	
	public static void main(String[] args) {
		
		//System.out.println(Mobile.APPLE);
		
		Mobile m=Mobile.SAMSUNG;
		
		switch(m)
		{
			case APPLE:
					System.out.println("Apple is best");
					System.out.println(Mobile.APPLE.getPrice());
					System.out.println(Mobile.APPLE.ordinal());
					break;
			
			case SAMSUNG:
					System.out.println("Samsung is best");
					System.out.println(Mobile.SAMSUNG.getPrice());
					System.out.println(Mobile.SAMSUNG.ordinal());
					break;
		}
		
		System.out.println("------------------------------------------");
		
		Mobile m1[]=Mobile.values();
		
		for(Mobile mobile: m1)
		{
			System.out.println(mobile);
		}
	}

}
