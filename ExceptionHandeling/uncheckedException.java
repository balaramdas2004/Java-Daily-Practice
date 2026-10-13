package com.balia.exceptionHandling;


public class uncheckedException 
{
	public static void main(String[] args) 
	{
		try 
		{
			System.out.print("Try ");

		} 
		catch (RuntimeException e) 
		{
			System.out.print("Catch ");

		} 
		finally 
		{

			System.out.print("Finally");

		}
	}
}