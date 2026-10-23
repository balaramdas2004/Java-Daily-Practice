package com.balia.MultiThreading;


class Employee 
{
	void display() 
	{
		System.out.println("Employee details");
	}
}

class Developer extends Employee implements Runnable 
{// we cannot extend multiple classes so we use IMplement Runnable 

	public void run() 
	{
	    System.out.println("Developer is writing code");
	}


}

public class PURPOSE_OF_Runnable_and_notUsingEXtend_Thread_demo1 
{
	public static void main(String[] args) 
	{
	
	    Developer d = new Developer();
	
	    d.display();
	
	    Thread t = new Thread(d);
	    t.start();
	}

}
