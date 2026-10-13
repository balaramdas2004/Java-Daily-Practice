package com.balia.exceptionHandling;

class Foo
{
	static 
	{
		IO.println("Static Block");
	}
}

public class exceptionPropagationHandledWithChecked 
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
		m2();
		IO.println("m1 method ended");
		
	}
	public static void m2() 
	{
		IO.println("m2 method started");
		try 
		{
		Class.forName("com.balia.exceptionHandling.Foo1");
		}
		catch(ClassNotFoundException e)
		{
			IO.println("Handled by m2 method");
		}
		IO.println("m2 method ended");
	}

}
