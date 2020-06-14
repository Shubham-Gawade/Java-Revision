//Encapsulation -> to change the value of variable we use method eg. setter and getter

package Pakage4;

class Abc3
{
	private int i;  //data hiding by declaring variable as a private. so, it can be used fot that class only

	public int getI() {   //to get data
		return i;
	}

	public void setI(int i) {  //to set data
		this.i = i;
	}
}

public class prog1 
{	
	public static void main(String[] args)
	{
		Abc3 obj=new Abc3();
		obj.setI(5);
		System.out.println(obj.getI());
	}
}
