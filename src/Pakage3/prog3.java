package Pakage3;

class Abc1
{
	public Abc1()
	{
		System.out.println("In Abc Default");
	}
	public Abc1(int a,float b)
	{
		System.out.println("In Parameterized Constructor");
	}
//	public Abc1(int a)
//	{
//		System.out.println("In Parameterized Int Constructor");
//	}
	public Abc1(double b)
	{
		System.out.println("In Parameterized double Constructor");
	}
}

public class prog3 {

	public static void main(String[] args) {
		//Abc1 obj=new Abc1(5,5.5f);
		Abc1 obj=new Abc1(5);
	}
}
