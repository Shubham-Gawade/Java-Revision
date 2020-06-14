//Abstraction -> Example

package Pakage4;

public class prog5 {

	public static void main(String[] args) 
	{
		Iphone obj=new Iphone();
		SamsungS3 obj1=new SamsungS3();
		show(obj);
		show(obj1);
	}
	
	public static void show(phone obj)
	{
		obj.showConfig();
		obj.display();
	}
}

abstract class phone
{
	public void display()
	{
		System.out.println("Welcome");
	}
	public abstract void showConfig();
}

class Iphone extends phone
{
	public void showConfig()
	{
		System.out.println("2GB Ram, IOS 9.3");
	}
}

class SamsungS3 extends phone
{
	public void showConfig()
	{
		System.out.println("2GB Ram, Lolipop");
	}
}