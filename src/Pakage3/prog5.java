//Static keyword

package Pakage3;

public class prog5 {

	public static void main(String[] args) 
	{
		//Non static method and variable require object
		//Abc2 obj=new Abc2();
		//obj.i=5;
		
		//Static method and variable don't need object. It only need class
		Abc2.show();
		Abc2.i=5;
		//Abc2.display(); Cannot make a static reference to the non-static method
		
		Abc2 obj1=new Abc2();
		Abc2 obj2=new Abc2();
		Abc2 obj3=new Abc2();
		obj1.j=10;
		obj2.j=20;
		obj3.j=30;
		
		obj1.display();
		obj2.display();
	}
}

class Abc2
{
	static int i=5;
	int j;
	public void display()
	{
		System.out.println("Hello");
		System.out.println(j);
	}
	
	public static void show()
	{
		System.out.println("Hii");
		//System.out.println(j); we can not use Non static variable in static method
		System.out.println(i);  //we can use Non static variable in static method
	}
}