//Wrapper class

package Pakage1;

import java.util.ArrayList;

public class prog7 {

	public static void main(String[] args) {
		
		int i=5;
		Integer iobj=new Integer(i);  //Boxing
		
		Integer jobj=i; //AutoBoxing
		
		int j=jobj.intValue();   //Unboxing
		System.out.println(j);
		int k=jobj;     //AutoUnboxing
		System.out.println(k);
		
		//Example 
		ArrayList<Integer> values=new ArrayList<Integer>();  //<Intger> -> generics means which type of values get stored
		values.add(5);  //boxing the value using autoboxing concept
		values.add(7);
		//values.add("Shubham"); error
	
		//processing of int is faster than Integer
	}

}
