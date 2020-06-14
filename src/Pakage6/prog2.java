//Vector -> Dynamic Array
//ArrayList -> Dynamic Array

package Pakage6;

import java.util.Vector;

public class prog2 {

	public static void main(String[] args)
	{
        Vector<Integer> v=new Vector<Integer>();
        
        v.add(2);
        v.add(4);
        v.add(6);
        v.add(7);
        v.add(7);
        v.add(8);
        v.add(7);
        v.add(4);
        v.add(1);
        v.add(3);
        v.add(7);
        
        System.out.println("Capacity: "+v.capacity());
        //Same like ArrayList
        //If you exceed the limit it increaes its size by 100%
        
        System.out.println("-------------------------------------------");
        for(int i:v)
        {
        	System.out.println(i);
        }
	}

}
