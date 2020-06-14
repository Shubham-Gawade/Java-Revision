package Pakage3;
import static java.lang.System.out;  //static import

public class prog7 
{
	static String s="";
	static
	{
		//static block is executed when your class is loaded into jvm
		System.out.println("Hello");
		s="Hello world";
	}
	public static void main(String[] args) 
	{
		System.out.println("The value of s : "+s);
		System.out.println("Bye");
		out.println("good bye");
	}
	static
	{
		//All static block is executed in sequence
		System.out.println("welcome");
	}
}
