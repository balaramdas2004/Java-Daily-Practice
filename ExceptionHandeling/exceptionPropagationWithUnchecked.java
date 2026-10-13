package com.balia.exceptionHandling;

public class exceptionPropagationWithUnchecked 
{
	public static void main(String [] args) 
	{
		IO.println("Enter the Main method");
		try
		{
			m1();
		}
		catch(ArithmeticException e)
		{
			IO.println("Handled by main method");
		}
		IO.println("main method ended");
	}
	public static void m1() 
	{
		IO.println("m1 method started");
		m2();
		IO.println( "m1 method ended");
		
	}
	public static void m2() 
	{
		IO.println("m2 method started");
		IO.println(10/0);
		IO.println("m2 method ended");
	}

}
