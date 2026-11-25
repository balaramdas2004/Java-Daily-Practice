package com.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcApp_DeleteSpecific_Data 
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
	
	public void deleteMethod()
	{
		try
		{
			Connection con = JdbcApp_DeleteSpecific_Data.getCon();
			Statement stm = con.createStatement();
			IO.println("Enter the EID u want to delete from the database:");
			String deleteEid = sc.nextLine();
			int rowCount = stm.executeUpdate("delete from employee where eid = '"+deleteEid+"'");
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String [] args)
	{
		JdbcApp_DeleteSpecific_Data obj = new JdbcApp_DeleteSpecific_Data();
		obj.deleteMethod();
		
	}
}
