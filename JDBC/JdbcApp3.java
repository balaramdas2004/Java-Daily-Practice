package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JdbcApp3 
{
	static String driver = "oracle.jdbc.OracleDriver";
	static String DBurl = "jdbc:oracle:thin:@localhost:1521:FREE";
	static String DBuName ="batch60";
	static String DBpwd = "123";
	
	Scanner sc = new Scanner(System.in);
	
	public Connection getConn()
	{
		Connection con = null;
		
		try
		{
			Class.forName(driver);
			con=DriverManager.getConnection(DBurl,DBuName,DBpwd);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
	
	public void patentMethod()
	{
		IO.println("Wlcome to the Patent Database");
		
		
		try
		{
			Connection con = getConn();
			PreparedStatement pstm1 = con.prepareStatement("insert into patent values (?,?,?,?)");
			PreparedStatement pstm2 = con.prepareStatement("select * from patent");
			PreparedStatement pstm3 = con.prepareStatement("select * from patent where pid =? ");
			PreparedStatement pstm4 = con.prepareStatement("update patent set pname = ?, age = ?, pcontact = ? where pid = ? ");
			PreparedStatement pstm5 = con.prepareStatement("delete from  patent where pid =? ");
			
			
			while(true)
			{
				IO.println("\n1. Insert the Patent details: ");
				IO.println("2. Retrive all the from the database: ");
				IO.println("3. Search Specific data from the table using PID: ");
				IO.println("4. Update the table data using PID: ");
				IO.println("5. Delete Specific Data from the table using PID: ");
				IO.println("6. Exit\n");
				
				IO.print("Enter your Choice: ");
				int choice = Integer.parseInt(sc.nextLine());
				
				switch(choice)
				{
					case 1 ->
					{
						IO.println("Add patent details:\n");
						IO.println("Add patent id :");
						String pId1 = sc.nextLine();
						
						IO.println("Add patent name :");
						String pName1 = sc.nextLine();
						
						IO.println("Add patent age :");
						int pAge1 =Integer.parseInt (sc.nextLine());
						IO.println("Add patent contact :");
						long pContact = Long.parseLong(sc.nextLine());
						
						pstm1.setString(1, pId1);
						pstm1.setString(2, pName1);
						pstm1.setInt(3, pAge1);
						pstm1.setLong(4, pContact);
						
						int rowCount = pstm1.executeUpdate();
						
						if(rowCount == 1)
						{
							IO.println(pId1+" record inserted!!\n");
						}
						else
						{
							IO.println("Record insertion failed!!\n");
						}
						
					}
					case 2 ->
					{
						IO.println("View the patents details from database:\n");
						ResultSet rs =pstm2.executeQuery();
						while(rs.next())
						{
							IO.println(rs.getString(1)+" "+ rs.getString(2)+" "+rs.getInt(3)+" "+rs.getLong(4));
						}
						
					}
					case 3 ->
					{
						IO.println("\nSearch specific data from the table:\n ");
						IO.println("Enter Search PID:");
						String pId = sc.nextLine();
						pstm3.setString(1, pId);
						ResultSet rs =pstm3.executeQuery();
						if(rs.next())
						{
							IO.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getLong(4));
						}
						else
						{
							IO.println("Record not found!!\n");
						}
						
					}
					case 4 ->
					{
						IO.println("\nUpdate the table data using PID:\n");
						IO.println("Enter the PID :");
						String pId4 = sc.nextLine();
						IO.println("Enter the Name :");
						String pName4 = sc.nextLine();
						IO.println("Enter the pAge: ");
						int pAge4 = Integer.parseInt(sc.nextLine());
						IO.println("Enter the pContact number:");
						long pContact4 = Long.parseLong(sc.nextLine());
						
						pstm4.setString(4, pId4);
						pstm4.setString(1, pName4);
						pstm4.setInt(2, pAge4);
						pstm4.setLong(3, pContact4);
						
						int rowCount = pstm4.executeUpdate();
						IO.println("rowCount "+rowCount);
						if(rowCount == 1)
						{
							IO.println(pId4+" record Inserted Successfully!!");
						}
						else
						{
							IO.println("Record Insertion failed!!");
						}
						
					}
					case 5 ->
					{
						IO.println("\nDelete the data from the Specific PID\n");
						IO.println("Enter the PID for delete:");
						String pID5 = sc.nextLine();
						pstm5.setString(1, pID5);
						int rowCount = pstm5.executeUpdate();
						
						if(rowCount ==1)
						{
							IO.println(pID5+" Record deleted successfully!!\n");
							
						}
						else
						{
							IO.println("Record Deletion failed!!\n");
						}
						
					} 
					case 6 ->
					{
						IO.println("\nThank you!!\n");
						System.exit(0);
						
					}
					default ->
					{
						IO.println("Invalid choice:\n");
					}
				}
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String []args)
	{
		JdbcApp3 obj = new JdbcApp3();
		obj.patentMethod();
		
	}

}
