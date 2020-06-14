//Collection And Generics
//collection -> Concept
//Collection -> Interface
//Collections -> Class

//Collectio(Interface) extends List(Interface) implements ArrayList(Class)

//Set -> No duplicate element

package Pakage6;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class prog1 {

	public static void main(String[] args)
	{
        //Collection<Integer> c=new ArrayList<>();  //<Integer> -> Generics
		//You can't add values value in between 
		//You can't use sort method
		
		List<Integer> c=new ArrayList<>();  
		//List can have duplicate values
		//In List,an index number is stored with each value starting from 0
		//If you exceed the limit it increaes its size by 50%
		
		c.add(1);
		c.add(3);
		c.add(3);
		c.add(5);
		c.add(5);
		c.add(3);
		
		c.add(1,9);
		
		c.remove(3);
		
		Iterator<Integer> i=c.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		System.out.println("---------------------------------");
		
		Collections.sort(c);
		
		for(int o:c) //autoboxing
		{
			System.out.println(o);
		}
		
		System.out.println("---------------------------------");
		
		c.forEach(System.out::println); //Stream API ... Lambda Expression
		
		System.out.println("---------------------------------");
		
		//Set -> Check for duplicate values
		
		Set<Integer> s=new HashSet<>();
		
		for(int o:c)
		{
			if(s.add(o)==false)
				System.out.println(o);
		}
	}

}
