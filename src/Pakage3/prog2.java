package Pakage3;

import java.util.Scanner;

public class prog2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		//class is blueprint of object 
		//class defines a structure of an object
		//object is instance of class
		
		//object knows -> variables
		//object does -> methods
		
		prog2 objname=new prog2();
		System.out.println(objname);
		objname = null;
		System.out.println(objname);
		//objname is a reference type variable and using new keyword the memory is allocated in heap memory using constructor 
		//at some address or hash code
		
		//primitive variable and reference type variable both are stored in stack memory along with name and value
		//address of object which is stored in heap memory will get store in stack memory
		
		objname=new prog2();
		System.out.println(objname);
		//now the objname object is again created in heap memory at new address and the address for objname is get replaced in 
		//stack memory
		//and the previous object is eligible for garbage collection
		
		//constructor
		//constructor is a method having same name as a class name and constructor will not return anything
		//it will be used to allocate memory
	}
}
