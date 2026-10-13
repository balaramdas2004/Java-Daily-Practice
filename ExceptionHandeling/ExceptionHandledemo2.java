package com.balia.exceptionHandling;

public class ExceptionHandledemo2 
{
	public static void main(String[] args) 
	{
		try 
		{
			System.out.print("A ");
			throw new IllegalArgumentException();
		} 
		catch (RuntimeException e) 
		{
			System.out.print("B ");
		}
	}
	
}
