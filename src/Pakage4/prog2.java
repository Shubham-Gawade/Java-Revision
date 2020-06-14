//inheritance

package Pakage4;


class Add  //Parent,Super,Base
{
	int num1,num2,result=0;
	public void add()
	{
		result=num1+num2;
	}
}

//child,sub,derived
class AddSub extends Add   //Single level inheritance
{
	public void sub()
	{
		result=num1-num2;
	}
}

class AddSubMul extends AddSub   //Multilevel level inheritance
{
	public void mul()
	{
		result=num1*num2;
	}
}

public class prog2
{	
	public static void main(String[] args)
	{
		AddSubMul obj=new AddSubMul();
		obj.num1=5;
		obj.num2=4;
		obj.add();
		System.out.println(obj.result);
		obj.sub();
		System.out.println(obj.result);
		obj.mul();
		System.out.println(obj.result);
	}
}