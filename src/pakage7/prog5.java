//JDBC

//import package -> java.sql
//load and register driver 	->
//create connection
//create statement
//execute query
//process the result
//close 

package pakage7;

import java.sql.*;
import java.util.Scanner;

public class prog5 {

	public static void main(String[] args) throws SQLException {
		
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		Scanner sc=new Scanner(System.in);
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","123456789");
			System.out.println("Connection Succesful");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		int ch;
		do
		{
			System.out.println("-----------------------------------------------");
			System.out.println("1)Insert data");
			System.out.println("2)Display data");
			System.out.println("3)Delete data");
			System.out.println("4)Update data");
			System.out.println("5)Exit");
			
			int ch1=sc.nextInt();
			
			switch(ch1)
			{
				case 1:
						System.out.println("Enter rollno :");
						int rollno=sc.nextInt();
						System.out.println("Enter name :");
						String name=sc.next();
						System.out.println("Enter address :");
						String address=sc.next();
						
						ps=con.prepareStatement("insert into mydata values(?,?,?)");
						ps.setInt(1, rollno);
						ps.setString(2, name);
						ps.setString(3, address);
						int i = ps.executeUpdate();
						
						if(i>0)
						{
							System.out.println("Stored Succesfully");
						}
						else
						{
							System.out.println("Not Stored Succesfully");
						}
						System.out.println("---------------------------------------------");
						break;
				case 2:
					    ps=con.prepareStatement("select * from mydata");
						rs=ps.executeQuery();
						System.out.println("Rollno  |  Name     |   Address");
						while(rs.next())
						{
							System.out.println("    "+rs.getInt(1)+"   | "+rs.getString(2)+"   |   "+rs.getString(3));
						}
						System.out.println("-------------------------------------------");
						break;
						
				case 3:
						System.out.println("Enter rollno to deleted :");
						int rollno1=sc.nextInt();
						ps=con.prepareStatement("delete from mydata where rollno=?");
						ps.setInt(1, rollno1);
						i=ps.executeUpdate();
						if(i>0)
						{
							System.out.println("Deleted Succesfully");
						}
						else
						{
							System.out.println("Not Deleted Succesfully");
						}
						System.out.println("---------------------------------------------");
						break;
				case 4:
						System.out.println("Enter rollno to be updated :");
						int rollno2=sc.nextInt();
						System.out.println("1)name");
						System.out.println("2)address");
						System.out.println("Enter which data to be updated");
						int ch2=sc.nextInt();
						
						switch(ch2)
						{
							case 1:
									System.out.println("Enter name to be updated :");
									String name1=sc.next();
									ps=con.prepareStatement("update mydata set name=? where rollno=?");
									ps.setString(1, name1);
									ps.setInt(2, rollno2);
									i=ps.executeUpdate();
									if(i>0)
									{
										System.out.println("Updated Succesfully");
									}
									else
									{
										System.out.println("Not Updated Succesfully");
									}
									break;
							
							case 2:
									System.out.println("Enter address to be updated :");
									String address1=sc.next();
									ps=con.prepareStatement("update mydata set address=? where rollno=?");
									ps.setString(1, address1);
									ps.setInt(2, rollno2);
									i=ps.executeUpdate();
									if(i>0)
									{
										System.out.println("Updated Succesfully");
									}
									else
									{
										System.out.println("Not Updated Succesfully");
									}
									break;		
								
							default:
									break;
						}
						System.out.println("---------------------------------------------");
						break;
				case 5:
						break;
			}
			System.out.println("Do you want to perform again(yes 1/No 0)");
			ch=sc.nextInt();
		}while(ch!=0);
	}

}
