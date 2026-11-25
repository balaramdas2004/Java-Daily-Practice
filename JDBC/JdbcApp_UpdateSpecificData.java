package com.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class JdbcApp_UpdateSpecificData 
{
	static String driver = "oracle.jdbc.OracleDriver";
	static String DBurl ="jdbc:oracle:thin:@localhost:1521:FREE";
	static String DBuName ="batch60";
	static String DBpwd ="123";
	
	Scanner sc = new Scanner(System.in);
	
	static Connection getCon()
	{
		Connection con = null;
		
		try
		{
			Class.forName(driver);
			IO.println("Driver Loaded");
			con = DriverManager.getConnection(DBurl,DBuName,DBpwd);
			IO.println("Database Connected Successfully");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
	
	public void disMethod()
	{
		System.out.println("Call the Display Method");
		try
		{
			Connection con =JdbcApp_retriveSpecific_data.getCon();
			Statement stm = con.createStatement();
			IO.println("Enter the eid that u want to retrive:");
			String retriveId = sc.nextLine();
			ResultSet rs = stm.executeQuery("select * from employee where eid = '"+retriveId+"'");
			
			ArrayList<String > al = new ArrayList<>();
			
			if(rs.next())
			{
				String data = rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5);
				al.add(data);
			}
			else
			{
				IO.println("no data present/exist");
			}
			
			Iterator <String > itr = al.iterator();
			while(itr.hasNext())
			{
				IO.println(itr.next());
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void updateMethod()
	{
		System.out.println("Call the update Method");
		try
		{
			Connection con = JdbcApp_UpdateSpecificData.getCon();
			Statement stm = con.createStatement();
			IO.println("Enter the eId where u want to update eSal:");
			String eid = sc.nextLine();
			IO.println("Enter the Amount u want to update:");
			int esal = Integer.parseInt(sc.nextLine());
			
			int rowCount = stm.executeUpdate("update employee set esal = "+esal+" where eid = '"+eid+"'");
			
			if(rowCount ==1)
			{
				IO.println(eid +"record is updated");
				IO.println("do u want to view the updated data(Y/N):");
				char choice = sc.nextLine().charAt(0);
				
				switch(choice)
				{
					case 'Y','y' -> new  JdbcApp_UpdateSpecificData().disMethod();
					case 'N', 'n' -> IO.println("Thank u for updating ");
					default -> IO.println("Invalid choice");
				}
				
			}
			else
			{
				throw new RuntimeException("NO data is updated");
				
			}
			
		} 
		
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
	}
	
	public static void main(String []args)
	{
		JdbcApp_UpdateSpecificData obj = new JdbcApp_UpdateSpecificData();
		obj.updateMethod();
	}

}
