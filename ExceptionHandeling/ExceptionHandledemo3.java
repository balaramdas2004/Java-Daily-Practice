package com.balia.exceptionHandling;

public class ExceptionHandledemo3 
{
	public static void main(String[] args) 
	{
		try 
		{
			IO.println("Try started");
			String s = null;
			s.length();
		}
		catch (NullPointerException e) 
		{
			System.out.print("Null");
		} 
		finally 
		{
			System.out.print("Done");
		}
	}
		
}
