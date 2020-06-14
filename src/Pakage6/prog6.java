//Inner Class

//Member
//Static
//Anonymous

package Pakage6;

//Member inner class
class A
{
	int i;
	class B
	{
		int j;
	}
}

//Static inner class
class X
{
	static int i;
	static class Y
	{
		int j;
	}
}

public class prog6 {

	public static void main(String[] args) {
		
		A obj=new A();
		obj.i=5;
		
		A.B obj1=obj.new B();
		obj1.j=10;
		
		System.out.println("------------------------");
		
		X.i=10;
	
		X.Y obj3=new X.Y();
		obj3.j=20;
	}

}
