//Properties file

package Pakage5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class prog5 {

	public static void main(String[] args) throws IOException 
	{
		Properties p=new Properties();
		
		OutputStream os=new FileOutputStream("dataConfig.properties");
		p.setProperty("url", "localhost:3300/myDb");
		p.setProperty("uname", "shubham");
		p.setProperty("password", "123456789");
		
		p.store(os, null);
		
		InputStream is=new FileInputStream("dataConfig.properties");
		p.load(is);
		
		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("uname"));
		System.out.println(p.getProperty("password"));
		
		System.out.println("--------------------------------------------------");
		
		p.list(System.out);
	}
}
