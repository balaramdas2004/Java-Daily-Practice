package com.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.ListIterator;

public class JdbcApp_PracticeUsing_ArrayList_demo2 
{
	
	String Driver = "oracle.jdbc.OracleDriver";
	String DBurl = "jdbc:oracle:thin:@localhost:1521:FREE";
	String DBuName = "batch60";
	String DBpwd ="123";
	
	public void connect()
	{
		System.out.println("Try to create the connection!!!");
		
		try 
		{
			Class.forName(Driver);
			Connection con =DriverManager.getConnection(DBurl,DBuName,DBpwd);
			System.out.println("Connected Successfully");
			Statement stm = con.createStatement();
			System.out.println("Object create for Statement!!");
			ResultSet rs =stm.executeQuery("select * from employee");
			System.out.println("Execute our SQL QUery ");
			System.out.println("Retive the employee details from employee table using ArrayList:");
			
			ArrayList<String > aobj = new ArrayList<>();
			
			
			while(rs.next())
			{
				String data = rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5);
				
				aobj.add(data);
				
			}
			
			IO.println(aobj);
			IO.println(aobj.toString());
			
			ListIterator<String > ltr = aobj.listIterator();
			
			IO.println("Acending order:");
			
			while(ltr.hasNext())
			{
				IO.println(ltr.next());
			}
			
			IO.println("Decending order:");
			
			while(ltr.hasPrevious())
			{
				IO.println(ltr.previous());
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String []args)
	{
		JdbcApp_PracticeUsing_ArrayList_demo2 obj =new JdbcApp_PracticeUsing_ArrayList_demo2();
		obj.connect();
	}

}
