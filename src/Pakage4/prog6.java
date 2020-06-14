package Pakage4;

public class prog6 {
	public static void main(String[] args) 
	{	
		//Final can be used with variable,method and class
		final int i=5,j=4,k;
		//j=6;       you can't change after value is assigned to final variable
		k=7;
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		//System.out.println(i++); you can't change after value is assigned to final variable
		
		//-----------------------------------------------------------------------------------------------
		
		Abc obj=new Abc(5);
		obj.display();
		
		//Ananymous object -> If you want to use object only once
		new Abc(10).display();
		//It is only using heap memory. Stack memeory is not been used.Bcoz reference variable is not created
		//It is eligible for garbage collection
		
		new Abc(10).k=10;
		new Abc(10).show(); //It will again create memory for object and the default value for k is 0
	}
}

final class Abc
{
	int k;
	final public void show()
	{
		System.out.println("In Abc show k is: "+k);
	}
	
	private int x;  //Instance variable
	
	public Abc(int x) //Local variable or formal parameter
	{
		this.x=x;  //this represents current instance //remove ambuigity between instance variable and formal parameter
	}
	public void display()
	{
		System.out.println("In Abc Display x is : "+x);
	}
}

// You can not extend final class
// class Pqr extends Abc
// {
//	    //You can not override final method
//	 	public void show()
//	 	{
//	 		System.out.println("In Pqr show");
//	 	}
// }
