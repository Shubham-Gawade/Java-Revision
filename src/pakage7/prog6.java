//Functional Programming -> focus on what to do
//Stream API

package pakage7;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class prog6 {

	public static void main(String[] args) {
		
		List<Integer> l=Arrays.asList(1,2,3,4,5);
		
		//External Iterartion
		
		for(int i:l)
		{
			System.out.println(i);
		}
		
		System.out.println("-----------------------");
		
		//Internal Iternation
		
		l.forEach(i -> System.out.println(i));
		
		System.out.println("-----------------------");
		
		Consumer<Integer> c=new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				
				System.out.println(t);
				
			}
		};
		
		l.forEach(c);
		
		System.out.println("-----------------------");
		
		Consumer<Integer> c2= (Integer t) ->{	System.out.println(t); };  //Lamda expression
		
		l.forEach(c2);
		
		System.out.println("-----------------------");
		
		l.forEach(i -> System.out.println(i));
	}

}
