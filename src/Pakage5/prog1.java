//Exception
//trowable(class) -> Exception(can be handle) and Error(can't be handle)
//Exception -> checked(IOException,SQLException) and Unchecked(Run Time EXception)


package Pakage5;

public class prog1 {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException,Exception {
		
		int i=5;
		int j=0;
		int k;
		
		int a[]= new int[4];
		try
		{
			k=i/j;
			for(int c=0;c<=4;c++)
			{
				a[c]=c+1;
			}
			for(int c=0;c<=4;c++)
			{
				System.out.println(a[i]);
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}
}
