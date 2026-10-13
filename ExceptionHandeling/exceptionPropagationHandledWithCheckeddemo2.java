package com.balia.exceptionHandling;

class Foody
{
	static
	{
		IO.println("Static block");
	}
}

public class exceptionPropagationHandledWithCheckeddemo2 
{
	public static void main(String[] args) 
	{
		IO.println("Main method started");
		m1();
		IO.println("main method Ended");

	}
	public static void m1() 
	{
		IO.println("M1 method started");
		try 
		{
			m2();
		}
		catch(ClassNotFoundException a)
		{
			IO.println("Handle by m1 method");
		}
		IO.println("m1 method ended");
		
	}
	public static void m2() throws ClassNotFoundException //its says that m2 method
														 //don't want to handle the exception
	{
		IO.println("m2 method started");
		
		Class.forName("com.balia.exceptionHandling.Food");
		
		IO.println("m2 method ended");
	}

}
