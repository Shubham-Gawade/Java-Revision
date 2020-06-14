package Pakage6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class prog5 {

	public static void main(String[] args) {
		
		List<Integer> l1=new ArrayList<>();
		
		l1.add(56);
		l1.add(67);
		l1.add(90);
		
		for(int i: l1)
		{
			System.out.println(i);
		}
		
		System.out.println("------------------------------------------");
		
		List<Integer> l2=Arrays.asList(56,67,90);
		
		for(int i: l2)
		{
			System.out.println(i);
		}
		
		System.out.println("------------------------------------------");
		
		List<Integer> l3=new ArrayList<Integer>()  //Anonymous block
		{{
			add(56);
			add(67);
			add(90);
		}};
		
		for(int i: l3)
		{
			System.out.println(i);
		}

	}

}
