package com.balia.collection;

import java.util.HashMap;
import java.util.Map;

class LoginService
{
	private Map<String , String> users;
	
	public LoginService()
	{
		users = new HashMap<>();
	}
	
	public void register(String name, String password)
	{
		users.put(name, password);
		IO.println("User Registration completed!!!");
	}
	
	public boolean isvalidUser(String name, String password)
	{
		if(users.containsKey(name) && users.get(name).equals(password))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

public class HashMap_Methos_demo2 {

	public static void main(String[] args) 
	{
		LoginService login = new LoginService();
		login.register("Ravi","1234");
		
		String name = IO.readln("Enter your username: ");
		String pass = IO.readln("Enter your Password: ");
		
		if(login.isvalidUser(name, pass))
		{
			IO.println("Hello "+name+" you are Authenticated!!!");
		}
		else
		{
			System.err.println("Sorry!!! wrong Username/password");
		}
	}

}
