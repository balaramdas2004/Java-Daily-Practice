package com.balia.exceptionHandling;


public class ExceptionHandledemo1 
{
	public static void main(String[] args) 
	{
		try 
		{
			int x = 5;
			if (x > 0) 
				throw new RuntimeException();
		}
		catch (Exception e) 
		{
			System.out.print("Caught");
		}
	}
}