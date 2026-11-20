package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbcApp2 
{

	String Driver = "oracle.jdbc.OracleDriver";
	String DBurl = "jdbc:oracle:thin:@localhost:1521:FREE";
	String uname = "batch60";
	String pwd = "123";
	
	void connect()
	{
		System.out.println("Connection is created!!");
		
		try
		{
			Class.forName(Driver);
			Connection con = DriverManager.getConnection(DBurl,uname,pwd);
			System.out.println("Connection competed!!");
			Statement stm = con.createStatement();
			System.out.println("Creating the Statement");
			ResultSet oo = stm.executeQuery("select * from employee");
			System.out.println("store");
			System.out.println(oo);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public static void main(String []args)
	{
		jdbcApp2 obj = new jdbcApp2();
		obj.connect();
	}

}
