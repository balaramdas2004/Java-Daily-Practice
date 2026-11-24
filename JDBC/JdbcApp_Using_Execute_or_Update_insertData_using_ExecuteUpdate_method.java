package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class JdbcApp_Using_Execute_or_Update_insertData_using_ExecuteUpdate_method 
{
	
	static String Driver = "oracle.jdbc.OracleDriver";
	static String DBurl = "jdbc:oracle:thin:@localhost:1521:FREE";
	static String DBuName = "batch60";
	static String DBpwd ="123";
	
	Scanner sc = new Scanner(System.in);
	
	static Connection getCon()
	{
		Connection con = null;
		try
		{
			Class.forName(Driver);
			con = DriverManager.getConnection(DBurl,DBuName,DBpwd);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
	
	public void connect()
	{
		System.out.println("Try to create the connection!!!");
		
		try 
		{
			Connection con = JdbcApp_Using_Execute_or_Update_insertData_using_ExecuteUpdate_method.getCon();
			System.out.println("Connected Successfully");
			Statement stm = con.createStatement();
			System.out.println("Object create for Statement!!");
			ResultSet rs =stm.executeQuery("select * from employee");
			System.out.println("Retrive the data from the employee table:");
			
			ArrayList<String > aobj = new ArrayList<>();
			
			
			while(rs.next())
			{
				String data = rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5);
				
				aobj.add(data);
				
			}
			
			//IO.println(aobj);
			//IO.println(aobj.toString());
			
			ListIterator<String > ltr = aobj.listIterator();
			
			IO.println("Acending order:");
			
			while(ltr.hasNext())
			{
				IO.println(ltr.next());
			}
			
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public void method2()
	{
		System.out.println("Inserting the data in to the employee table");
		try
		{
			Connection con = JdbcApp_Using_Execute_or_Update_insertData_using_ExecuteUpdate_method.getCon();
			Statement stm=con.createStatement();
			
			System.out.println("Enter ur empid:");
			String eid = sc.nextLine();
			System.out.println("Enter ur FName:");
			String fName = sc.nextLine();
			System.out.println("Enter ur LName:");
			String lName = sc.nextLine();
			System.out.println("Enter ur Esal:");
			int eSal =Integer.parseInt(sc.nextLine());
			System.out.println("Enter ur Address:");
			String adrss = sc.nextLine();
			
			int rowCount = stm.executeUpdate("insert into employee values('"+eid+"', '"+fName+"','"+lName+"',"+eSal+",'"+adrss+"')");
			
			if(rowCount == 1)
			{
				System.out.println(eid+" record inserted!!");
				System.out.println("Do u want to view the data (Y/N)");
				
				char choice = sc.nextLine().charAt(0);
				
				switch(choice)
				{
					case 'y', 'Y' -> new JdbcApp_Using_Execute_or_Update_insertData_using_ExecuteUpdate_method().connect();
					case 'n', 'N' -> System.out.println("Thank u for Enterng the data!!");
					default ->
					{
						System.out.println("Invalid choice");
					}
				}
			}
			else
			{
				throw new RuntimeException("data not inserted inton  employee id");
			}
			
		}
		
		catch(SQLIntegrityConstraintViolationException e)
		{
			System.out.println("Duplicate data are not inserted");
			method2();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	 
	
	
	public static void main(String []args)
	{
		
		JdbcApp_Using_Execute_or_Update_insertData_using_ExecuteUpdate_method obj =new JdbcApp_Using_Execute_or_Update_insertData_using_ExecuteUpdate_method();
		obj.method2();
	}

}
