//Anonymous inner class

package Pakage6;

class phone
{
	public void show()
	{
		System.out.println("Call");
	}
}
public class prog7 {

	public static void main(String[] args) {
		
		phone p=new phone()  //Anonymous inner class
				{
					public void show()
					{
						System.out.println("Call,sms,camera");
					}
				};
				
		p.show();	
		
		System.out.println("-------------------------------------------");
		
		//phone p1 =() -> {System.out.println("Call,sms,camera");}; //Lambda Expression
			
	}

}
