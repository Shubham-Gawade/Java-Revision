package Pakage2;

import java.util.Scanner;

public class prog3 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==n)
		{
			System.out.println("Perfect");
		}
		else
		{
			System.out.println("Not perfect");
		}
	}

}
