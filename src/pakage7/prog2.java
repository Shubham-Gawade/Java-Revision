//Annotation

package pakage7;

import java.util.ArrayList;

@FunctionalInterface //if we use this then we can use only one method inside interface 
interface Abc
{
	void show();
	//void abc();
}

class A
{
	public void showMyDatabase()
	{
		System.out.println("In A showMyDatabase");
	}
}
class B extends A
{
	@Deprecated   //Describes that this method is depreceted and not to used in main class
	public void show()
	{
		System.out.println("show");
	}
	
	@Override
	@SuppressWarnings("unchecked") //Ignore warning for not specifying generics
	//public void showMyDataBase()  //It will inform that this method is not existed in extened class
	public void showMyDatabase()
	{
		ArrayList obj=new ArrayList<>();
		System.out.println("In B showMyDatabase");
	}
}
public class prog2 {

	public static void main(String[] args) {
		
		B obj=new B();
		obj.showMyDatabase();
		
		//depreceted method
		obj.show();
	}

}
