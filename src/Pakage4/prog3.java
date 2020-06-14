//polymorphism -> same name but different behavior

package Pakage4;

public class prog3
{	
	public static void main(String[] args)
	{
		B obj=new B(); //whenever you call default constructor of sub class then you first call default constructor of super class
		
		System.out.println("---------------------------------");
		
		B obj1=new B(5); //whenever you call parameter constructor of sub class then you first call default constructor of super class
	
		System.out.println("---------------------------------");
		
		A obj2=new B();  //reference of super class and object of sub class
		
		System.out.println("---------------------------------");
		
		B obj3=new B(5);
		obj3.show();
		obj3.show(5);
		obj3.show(5.5);
		
		System.out.println("---------------------------------");
		//Dynamic Method Dispatch
		A obj4=new B(5);
		A a;
		//a.show(); a pointing to null reference
		a=obj3;
		a.show();
	}
}

class A
{
	//Constructor Overloading
	public A()   
	{
		super();// Every Class extends Object class. It will default constructor of Object Class
		System.out.println("In A constructor");
	}
	public A(int i)
	{
		System.out.println("In A constructor int parameter");
	}
	
	//Method Overloading or Early Binding or Static Binding or Compile time polymorphism
	//same function name but different parameter list 
	public void show()   
	{
		System.out.println("In A show");
	}
	public void show(int i)
	{
		System.out.println("In A show int parameter");
	}
	public void show(double i)  //Type can be change but parameter list is same
	{
		System.out.println("In A show double parameter");
	}
}

class B extends A
{
	public B()
	{
		super(); //it will call parent default constructor
		System.out.println("In B constructor");
	}
	public B(int i)
	{
		super(i); //it will call parent parameterized constructor
		System.out.println("In B constructor int parameter");
	}
	
	//Method overriding or Late Binding or Dynamic Binding or Run time polymorphism
	//same name and same parameter in different class
	public void show() 
	{
		System.out.println("In B show");
	}
}
