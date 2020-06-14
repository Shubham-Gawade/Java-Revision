//Bitwise operator AND -> & and OR-> |

package Pakage1;

public class prog3 {
	
	public static void main(String args[])
	{
		//Bitwise AND
		
		int a=25; //  1 1 0 0 1
		int b=15; //  0 1 1 1 1
		          //  0 1 0 0 1 -> 9
		int c = a&b;
		System.out.println(c);
		
		//Bitwise AND
		
		int i=25; //  1 1 0 0 1
		int j=15; //  0 1 1 1 1
		          //  1 1 1 1 1 -> 31
		int k = i|j;
		System.out.println(k);
	}

}
