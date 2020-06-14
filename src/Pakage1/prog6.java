//Number and letter Pattern

package Pakage1;

public class prog6 {

	public static void main(String[] args) 
	{	
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println("");
		}
		System.out.println("//////////////////////////////////////////////////");
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println("");
		}
		System.out.println("//////////////////////////////////////////////////");
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println("");
		}
		System.out.println("//////////////////////////////////////////////////");
		

		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println("");
		}
		System.out.println("//////////////////////////////////////////////////");

		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println("");
		}
		System.out.println("//////////////////////////////////////////////////");
		

		for(char i='A';i<='E';i++)
		{
			for(char j='A';j<='E';j++)
			{
				System.out.print(i+" ");
			}
			System.out.println("");
		}
		System.out.println("//////////////////////////////////////////////////");
		
		for(int i=65;i<=69;i++)
		{
			for(int j=65;j<=69;j++)
			{
				System.out.print((char)i+" ");
			}
			System.out.println("");
		}
		System.out.println("//////////////////////////////////////////////////");

		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+i);
			}
			System.out.println("");
		}
		System.out.println("//////////////////////////////////////////////////");
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+j);
			}
			System.out.println("");
		}
		System.out.println("//////////////////////////////////////////////////");
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+j);
			}
			System.out.println("");
		}
		System.out.println("//////////////////////////////////////////////////");
		
		for(int i=65;i<=69;i++)
		{
			for(int j=69;j>=i;j--)
			{
				System.out.print((char)i+" ");
			}
			System.out.println("");
		}
		System.out.println("//////////////////////////////////////////////////");
		
		for(int i=65;i<=69;i++)
		{
			for(int j=68;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=65;k<=i;k++)
			{
				System.out.print((char)i);
			}
			System.out.println("");
		}
		System.out.println("//////////////////////////////////////////////////");
		
		for(int i=65;i<=69;i++)
		{
			for(int j=65;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=69;k++)
			{
				System.out.print((char)k+" ");
			}
			System.out.println("");
		}
		System.out.println("//////////////////////////////////////////////////");
		
		for(int i=65;i<=69;i++)
		{
			for(int j=68;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=65;k<=i;k++)
			{
				System.out.print((char)i+" ");
			}		
			System.out.println("");
		}
		System.out.println("//////////////////////////////////////////////////");
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==3 || j==3)
				{
					System.out.print("X");
				}
				else
				{
					System.out.print("O");
				}
			}
			System.out.println("");
		}
		System.out.println("//////////////////////////////////////////////////");
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==j)
				{
					System.out.print("O");
				}
				else
				{
					System.out.print("X");
				}
			}
			System.out.println("");
		}
		System.out.println("//////////////////////////////////////////////////");
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==j || i+j==6)  // j==5-i+1
				{
					System.out.print("X");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		System.out.println("//////////////////////////////////////////////////");
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1 || i==5 || j==1 || j==5)
				{
					System.out.print("X");
				}
				else
				{
					System.out.print("#");
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
			for(int k=1;k<=i;k++)
			{
				System.out.print("X");
			}
			for(int l=2;l<=i;l++)
			{
				System.out.print("X");
			}
			System.out.println("");
		}
		System.out.println("//////////////////////////////////////////////////");
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				int k=i+j-1;
				if(k>4)
				{
					System.out.print(k-4+" ");
				}
				else
				{
					System.out.print(k+" ");
				}
			}
			System.out.println("");
		}
		System.out.println("//////////////////////////////////////////////////");
		
		for(int i=1;i<=4;i++)
		{
			int k;
			for(int j=i;j<i+4;j++)
			{
				k=j%4;
				if(k==0) {
					k=4;
				}
				System.out.print(k+" ");
			}
			System.out.println("");
		}
		System.out.println("//////////////////////////////////////////////////");
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j%2!=0)
				{
					System.out.print(1+" ");
				}
				else
				{
					System.out.print(0+" ");
				}	
			}
			System.out.println("");
		}
		System.out.println("//////////////////////////////////////////////////");
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if((i+j)%2==0)
				{
					System.out.print(1+" ");
				}
				else
				{
					System.out.print(0+" ");
				}	
			}
			System.out.println("");
		}
		System.out.println("//////////////////////////////////////////////////");
	}
}
