//Map -> HashMap

package Pakage6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class prog4 {

	public static void main(String[] args) {
		
		Map<String,String> m=new HashMap<String, String>();

		m.put("name", "Shubham");
		m.put("surname", "gawade");
		m.put("rollno", "42");
		
		System.out.println(m);
		
		System.out.println("-----------------------------------");
		
		System.out.println(m.get("name"));
		
		System.out.println("-----------------------------------");
		
		Set<String> s=m.keySet();
		
		for(String key: s)
		{
			System.out.println(key+" "+m.get(key));
		}
		
		//key can not be dupicate
		
		System.out.println("-----------------------------------");
		
		Set<Map.Entry<String, String>> e=m.entrySet();
		
		for(Map.Entry<String, String> o: e)
		{
			System.out.println(o.getKey()+" "+o.getValue());
		}
		
		System.out.println("-----------------------------------");
	}

}
