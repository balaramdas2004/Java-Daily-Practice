package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JdbcApp4 
{
	static String driver="oracle.jdbc.OracleDriver";
	static String dburl = "jdbc:oracle:thin:@localhost:1521:FREE";
	static String dbuname = "batch60";
	static String dbpwd ="123";
	
	Scanner sc = new Scanner(System.in);
	
	public Connection getCon()
	{
		Connection con = null;
		try
		{
			Class.forName(driver);
			con = DriverManager.getConnection(dburl,dbuname,dbpwd);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
	
	public void libraryManagement()
	{
		IO.println("WELCOME TO THE LIBRARY!!");
		
		try
		{
			Connection con = getCon();
			PreparedStatement pstm1 = con.prepareStatement("INSERT INTO LIBRARY VALUES (?, ?, ?, ?, ?)");
			PreparedStatement pstm2 = con.prepareStatement("SELECT * FROM LIBRARY ");
			PreparedStatement pstm3 = con.prepareStatement("DELETE FROM LIBRARY WHERE BOOKID = ?");
			PreparedStatement pstm4 = con.prepareStatement("SELECT * FROM LIBRARY WHERE BOOKID =?");
			
			while(true)
			{
				IO.println("1. ADDING THE DETAILS TO THE DATABASE");
				IO.println("2. RETRIVE THE DATA FROM THE DATABASE");
				IO.println("3. DELETE THE BOOK DETAILS");
				IO.println("4. DISPLAY THE RESULT ");
				IO.println("5. EXIT");
				
				IO.println("Enter your choice:");
				int choice = Integer.parseInt(sc.nextLine());
				
				switch(choice)
				{
					case 1 ->
					{
						IO.println("ADDING THE DETAILS TO THE DATABASE");
						IO.println("Enter the BOOKID:");
						String bId = sc.nextLine();
						IO.println("Enter the BOOK NAME:");
						String bName = sc.nextLine();
						IO.println("Enter the AUTHOR NAME :");
						String bAuthor = sc.nextLine();
						IO.println("Enter the GENERE NAME :");
						String bGenere = sc.nextLine();
						IO.println("Enter the BOOK COST :");
						double bCost = Double.parseDouble(sc.nextLine());
						
						pstm1.setString(1,bId);
						pstm1.setString(2, bName);
						pstm1.setString(3, bAuthor);
						pstm1.setString(4, bGenere);
						pstm1.setDouble(5, bCost);
						
						int rowCount = pstm1.executeUpdate();
						if(rowCount==1)
						{
							IO.println(bId+" Record inserted Successfully!!!");
						}
						else 
						{
							IO.println("Insertion Failed!!");
						}
					}
					
					case 2 ->
					{
						IO.println("RETRIVE THE DATA FROM THE DATABASE");
					
						ResultSet rs = pstm2.executeQuery();
						
						while(rs.next())
						{
							IO.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getDouble(5));
						}
						
						
					}
					
					case 3 ->
					{
						IO.println("DELETE THE BOOK DETAILS");
						IO.println("Enter the BOOk ID that u want to delete:");
						String dBid = sc.nextLine();
						
						pstm3.setString(1, dBid);
						
						int rowCount = pstm3.executeUpdate();
						
						if(rowCount==1)
						{
							IO.println(dBid+" deleted Successfully!!");
						}
						else 
						{
							IO.println("Record not deleted !!");
						}
					}
					
					case 4 ->
					{
						IO.println("DISPLAY THE RESULT ");
						IO.println("Enter the BOOK ID that you want to display:");
						String dBid = sc.nextLine();
						
						pstm4.setString(1,dBid);
						
						ResultSet rs = pstm4.executeQuery();
						
						if(rs.next())
						{
							IO.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
						}
						else 
						{
							IO.println("Record not Found!!");
						}
						
						
					}
					case 5 ->
					{
						IO.println("EXIT");
						System.exit(0);
					}
					
					default ->
					{
						IO.println("Invalid choice!!");
					}
				}
				
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) 
	{
		JdbcApp4 obj = new JdbcApp4();
		obj.libraryManagement();
	}

}
