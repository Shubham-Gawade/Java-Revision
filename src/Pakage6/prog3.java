//LinkedList -> implements List
//Double Linked List
//Insert and Delete -> Faster than ArrayList
//Search -> Slower than ArrayList

package Pakage6;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

class ComparatorClass implements Comparator<Integer>
{
	@Override
	public int compare(Integer o1, Integer o2) {
		
		if(o1>o2)  
			return 1;
		
//		if(o1%10>o2%10) //last 1 digit  
//			return 1;
		
		return -1;
	}	
}

public class prog3 {

	public static void main(String[] args)
	{	
		LinkedList<Integer> l=new LinkedList<>();
		
		l.add(3);
		l.add(2);
		l.add(4);
		l.add(1);
		
		l.add(1,5);
		
		for(int i: l)
		{
			System.out.println(i);
		}
		System.out.println("----------------------------------------");
		
		//Collections.sort(l);
		
		Comparator<Integer> c=new ComparatorClass();
		
		Collections.sort(l,c);
		
		for(int i: l)
		{
			System.out.println(i);
		}
		System.out.println("-----------------------------------------");
		
		l.remove(4); //index no 4 -> Element 5 is removed
		
		Collections.reverse(l);
		
		for(int i: l)
		{
			System.out.println(i);
		}
		System.out.println("------------------------------------------");
		
		l.add(6);
		
		for(int i: l)
		{
			System.out.println(i);
		}
		
		System.out.println("-------------------------------------------");
	}
}
