package Pakage2;

import java.util.Scanner;

public class prog5 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		int count=0;
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count<=2)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not Prime");
		}
	}

}
