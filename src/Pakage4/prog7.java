//Interface

//Every method is by defalut abstract
//In Interface, you can not define method
//You can not create object of interface

//Marker Interface -> without aby methods
//SAM -> Single abstract method -> Functional interface
//Normal interfase

package Pakage4;

interface def
{
	void show();
}

interface lmn extends def  //interface to interface we use extends
{
	void print();
}

class wxy implements def,lmn  //multiple inheritance //class to interface we use implements
{
	public void show()
	{
		System.out.println("Hello from show");
	}
	public void print()
	{
		System.out.println("Hello from print");
	}
	public void display()
	{
		System.out.println("Hii");
	}
}

public class prog7 {

	public static void main(String[] args) 
	{
		wxy obj=new wxy();
		obj.show();
		obj.print();
		obj.display();
		
		//--------------------------------------------------------------------------------------------
		
		def obj1=new wxy(); //we can create reference of interface
		obj1.show();
		//obj1.display(); we are restricting the use of display method
		
		//--------------------------------------------------------------------------------------------
		
		def obj2=new def() //to create object of interface we can use anonymous inner class
		{  
			public void show()
			{
				System.out.println("Hello");
			}
		};
		obj2.show();
		
		//--------------------------------------------------------------------------------------------
		
		def obj3 = () ->  //Lamda expression
		{
				System.out.println("Hello");
		};
		obj3.show();
	}

}
