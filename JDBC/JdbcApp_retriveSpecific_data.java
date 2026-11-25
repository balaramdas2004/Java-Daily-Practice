package com.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class JdbcApp_retriveSpecific_data 
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
			//Statement stm = con.createStatement();
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
	
	public static void main(String []args)
	{
		JdbcApp_retriveSpecific_data obj = new JdbcApp_retriveSpecific_data();
		obj.disMethod();
	}
}
