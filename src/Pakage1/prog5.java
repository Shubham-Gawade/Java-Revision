//Star Pattern

package Pakage1;

public class prog5 {

	public static void main(String[] args) 
	{	
	
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i==1 || j==1 || i==4 || j==4) 
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
		
		System.out.println("//////////////////////////////////////////////////");
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
		
		System.out.println("//////////////////////////////////////////////////");
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
		System.out.println("//////////////////////////////////////////////////");
		for(int i=1;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k1=1;k1<=i;k1++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("//////////////////////////////////////////////////");
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k1=4;k1>=i;k1--)
			{
				System.out.print("*");
			}	
			System.out.println("");
		}
		System.out.println("//////////////////////////////////////////////////");
		for(int i=1;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k1=1;k1<=i;k1++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k1=3;k1>=i;k1--)
			{
				System.out.print("*");
			}	
			System.out.println("");
		}
		System.out.println("//////////////////////////////////////////////////");
		for(int i=1;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k1=1;k1<=i;k1++)
			{
				System.out.print(" *");
			}
			System.out.println("");
		}
		System.out.println("//////////////////////////////////////////////////");
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=1;j--)
			{
				if(j>i)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(" *");
				}
			}
			System.out.println("");
		}
		System.out.println("//////////////////////////////////////////////////");
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k1=1;k1<=i;k1++)
			{
				System.out.print("*");
			}
			for(int l=2;l<=i;l++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("//////////////////////////////////////////////////");
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k1=4;k1>=i;k1--)
			{
				System.out.print("*");
			}
			for(int l=3;l>=i;l--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("//////////////////////////////////////////////////");
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k1=9;k1>(i*2);k1--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("//////////////////////////////////////////////////");
		for(int i=5;i>=1;i--)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k1=1;k1<(i*2);k1++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("//////////////////////////////////////////////////");
		for(int i=1;i<=5;i++)
		{
			for(int j=2;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("//////////////////////////////////////////////////");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i>=2 && j<=i-1)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(" *");
				}
			}
			System.out.println("");
		}
		System.out.println("//////////////////////////////////////////////////");
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("//////////////////////////////////////////////////");
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k1=1;k1<(i*2);k1++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("//////////////////////////////////////////////////");
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k1=1;k1<(i*2);k1++)
			{
				if(k1>1 && k1<(i*2)-1)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		System.out.println("//////////////////////////////////////////////////");
		for(int i=5;i>=1;i--)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k1=1;k1<(i*2);k1++)
			{
				if(k1>1 && k1<(i*2)-1)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		System.out.println("//////////////////////////////////////////////////");
	}
}
