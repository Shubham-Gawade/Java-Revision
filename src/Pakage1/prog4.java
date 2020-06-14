//Left shift << and Right shift >> operator
//Ternary operator

package Pakage1;

public class prog4 {

	public static void main(String[] args) 
	{	
		int a=8;  // 1 0 0 0.
		
		int b=a<<2; //1 0 0 0 0 0. ->32 only add extra 2 zero
		
		System.out.println(b);
		
		int i=8;  // 1 0 0 0.
		
		int j=i>>2; //1 0. ->2  shift 2 zero to right side of point
		
		System.out.println(j);
		
		int m=1;
		int n=5;
		
		n= m==1?6:7;
		
		System.out.println(n);

	}

}
