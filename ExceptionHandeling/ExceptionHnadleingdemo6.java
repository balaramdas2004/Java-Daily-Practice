package com.balia.exceptionHandling;
class pik
{
	
}

public class ExceptionHnadleingdemo6 
{
	public static void main(String[] args) 
    {
        try
        {
            Class.forName("com.balia.exceptionHandling.pik");
            IO.println("Class loaded successfully: ");
        }
        catch(ClassNotFoundException e)
        {
            IO.println("ClassNotFoundException: ");
        }
        
        
    }
}

// here we can't find the class name because the we give the class name as a input but there 
//is no such class is present so instead of passing the class name u must pass the actual class name 