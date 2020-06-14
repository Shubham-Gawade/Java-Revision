//Object Cloning

package Pakage5;

public class prog3 {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		abcde obj=new abcde();
		obj.i=5;
		obj.j=6;
		
		//Shallow copy
		abcde obj1=obj;
		obj1.j=8;
		System.out.println(obj1);
		//----------------------------------------------------------------
		
		//Deep Copy
		abcde obj2=new abcde();
		obj2.i=obj.i;
		obj2.j=obj.j;
		System.out.println(obj2);
		//----------------------------------------------------------------
		
		//Cloning
		abcde obj3=(abcde)obj.clone();
		System.out.println(obj3);
	}
}

class abcde implements Cloneable
{
	int i;
	int j;
	
	@Override
	public String toString() {
		return "abcde [i=" + i + ", j=" + j + "]";
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
