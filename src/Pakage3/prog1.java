package Pakage3;

import java.util.Scanner;

class abc
{
	public void show(int ... a) //varags variable
	{
		for(int i:a)
		{
			System.out.println(i);
		}
	}
	
	public void show(int a)
	{
		System.out.println(a);
	}
}

public class prog1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		abc obj=new abc();
		obj.show(5,6,7,8);
	}
}
