package Pakage1;

public class prog1 {
	    
	public static void main(String args[])
	{
		//javac converts the java code into byte code
		//javap gives the structure of class methods and variables
		
		//Error		
		//		float a = 2.3;
		//		float b = 3.5;
		float num1 = 2.3f;
		float num2 = 3.5f;
		System.out.println(num1+num2);
		
		//Error		
		//		char c = "A";
		char c = 'A';
		System.out.println(c);
		
		int i,j,k;
		i=5;
		j=4;
		k=i+j;
		System.out.println("The addition of "+i+" and "+j+" is "+k);
		System.out.printf("The addition of %d and %d is %d",i,j,k);
		System.out.println();
		
		//Representation of binary number
		
		int a = 0B101_00_101;
		System.out.println(a);
		
	}
}
