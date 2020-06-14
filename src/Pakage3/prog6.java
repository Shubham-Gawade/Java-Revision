//counting objects

package Pakage3;

class Abc3
{
	static int i=0;
	//int i=0; instance variable
	public Abc3()
	{
		i++;
	}
	public void counter()
	{
		System.out.println(i);
	}
}

public class prog6 {

	public static void main(String[] args) throws Exception, IllegalAccessException {
		
		Abc3 obj1=new Abc3(); //object created using new keyword
		Abc3 obj2=new Abc3();
		Abc3 obj3=new Abc3();
		Abc3 obj4=obj1;  //object is not created. its a same reference to obj1
		
		//object created using clone
		//object created using De-serializtion
		
		//Class c=Class.forName("package3"); //create oject without using new keyword
		//Abc2 t=(Abc2)c.newInstance();
		//t.display();
		
		obj1.counter();
		obj3.counter();
		//instance variable is separte for every object
		//static variable share their copy in every object
	}

}
