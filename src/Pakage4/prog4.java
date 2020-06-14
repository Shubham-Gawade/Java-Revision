//Abstraction -> getting specific data not complete data

//Abstract class can contain abstract method or non-abstract method
//If you declare abstract method then you must declare class as abstract
//Abstract methods are methods can only be declared,not defined
//You can not create object of abstract class

package Pakage4;

abstract class abcd   //abstract class
{
	public void call()
	{
		System.out.println("Calling...");
	}
	public abstract void move(); //Abstract method
	
	public abstract void camera();
}

abstract class pqr extends abcd  //concrete class //Astract class
{
	public void move() //move method is overrided
	{
		System.out.println("Moving...");
	}
}

class xyz extends pqr //concrete class
{
	public void camera()
	{
		System.out.println("Taking picture...");
	}
}

public class prog4 {

	public static void main(String[] args) 
	{
		xyz obj=new xyz();
		obj.call();
		obj.move();
		obj.camera();
	}
}
