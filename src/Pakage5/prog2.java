//User defined exception

package Pakage5;

public class prog2 {

	public static void main(String[] args) {
		
		int i=5;
		try
		{
			if(i<10)
			{
				throw new MyException("Errorrr");
			}
		}
		catch(Exception e)  //catch(MyException e) directly
		{
			System.out.println(e);
		}
	}
}

class MyException extends Exception
{
	public MyException(String msg)
	{
		super(msg);
	}
}