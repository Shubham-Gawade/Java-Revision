package Pakage2;

import java.util.Scanner;

public class prog2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		
		int temp=n,r,rev = 0;
		
		for(int i=0;n>0;i++)
		{
			r=n%10;
			rev=(rev*10)+r;
			n=n/10;
		}
		if(temp==rev)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
	}

}
