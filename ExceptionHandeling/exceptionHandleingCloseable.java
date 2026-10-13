package com.balia.exceptionHandling;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

interface Closeable
{
	 void close() throws IOException;
}

public class exceptionHandleingCloseable 
{

	public static void main(String[] args) 
	{
		Scanner sc = null;
		try
		{
			sc = new Scanner(System.in);
			IO.println("start try");
			IO.println(sc.nextInt());
			throw new InputMismatchException();
		
		}
		catch(InputMismatchException e)
		{
			IO.println("Exception is handeled");
		}
		finally
		{
			IO.println("heeeeee hee");
			sc.close();
		}

	}

}
