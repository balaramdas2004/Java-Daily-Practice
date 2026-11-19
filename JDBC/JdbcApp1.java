package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcApp1 
{
	String driver = "oracle.jdbc.OracleDriver";
	String DBurl = "jdbc:oracle:thin:@localhost:1521:FREE";
	String uname = "batch60";
	String pwd = "123";
	
	void connect()
	{
		System.out.println("Connecting to the DataBase");
		
		try
		{
			Class.forName(driver);
			Connection con = DriverManager.getConnection(DBurl,uname,pwd);
			
			System.out.println("Connection created!!");
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String []args)
	{
		JdbcApp1 obj1 = new JdbcApp1();
		obj1.connect();
	}

}
