package com.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcApp_Practice_demo1 
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
			
			while(rs.next())
			{
				System.out.println(rs.getString(1)+" "+rs.getString(2));
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String []args)
	{
		JdbcApp_Practice_demo1 obj =new JdbcApp_Practice_demo1();
		obj.connect();
	}

}
