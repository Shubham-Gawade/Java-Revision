//Fibonacci series

package Pakage2;

public class prog1 {

	public static void main(String[] args) 
	{
		int a=1;
		int b=1;	
		System.out.println(a);
		System.out.println(b);
		for(int i=1;i<=10;i++)
		{
			int c;
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
	}
}
