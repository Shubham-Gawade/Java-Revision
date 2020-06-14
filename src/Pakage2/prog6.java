//String Operation
//String Spliting
//toString method
//String is Immutable

package Pakage2;

import java.io.IOException;

public class prog6 {

	public static void main(String[] args) throws IOException {
		
		//Read input without using scanner
		System.out.println("Enter a number");
		int n=System.in.read();  
		System.out.println((char)n);
		System.out.println("-------------------------------------------------------");
		
		String str = "Shubham,Pranav,Stephen,Sanket";
		
		String names[]=str.split(",");
		
		for(int i=0;i<names.length;i++)
		{
			System.out.println(names[i]);
		}
		
		System.out.println("--------------------------------------------------------");
		student s=new student(11,"shubham");
		System.out.println(s.toString());
	}
}

class student extends Object
{
	int rollno;
	String name;
	
	public student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	
	@Override
	public String toString()
	{
		return "Student{"+"Name: "+name+", Rollno: "+rollno+"}";
	}
}
