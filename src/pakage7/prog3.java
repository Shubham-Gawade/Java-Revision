//Create your own annotation -> class,methods,variables

package pakage7;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Marker Annotation -> no value
//Single value Annotation -> one vale
//Multi value Annotation


//Meta data Annoation
@Inherited   
@Documented  
@Target(ElementType.TYPE)  //class level -> on what level we are using this annotation
@Retention(RetentionPolicy.RUNTIME) 
@interface SmartPhone
{
	String os();
	int version();
	String colour() default "black";
}

@SmartPhone(os="Andriod",version=6)
class NokiaSeries
{
	String model;
	int size;
	
	public NokiaSeries(String model, int size) {
		super();
		this.model = model;
		this.size = size;
	}
	
}

public class prog3 {

	public static void main(String[] args) {
		
		NokiaSeries obj=new NokiaSeries("fire", 5);
		//System.out.println(obj.model);
		
		Class c=obj.getClass();  //reflection API where you can get fetures of object
		
		Annotation an=c.getAnnotation(SmartPhone.class);
		
		SmartPhone s=(SmartPhone)an;
		
		System.out.println(s.os());
	}

}
