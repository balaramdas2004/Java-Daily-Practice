package com.balia.MultiThreading;

class Alpha extends Thread
{
	@Override
	public void run()
	{
		String name = Thread.currentThread().getName();
		
		IO.println(name +" Thread Started");
		
		Beta beta = new Beta();
		beta.setName("Beta");
		
		beta.start();
		try
		{
			beta.join();
			
		}
		catch(InterruptedException e)
		{
			
		}
		IO.println(name +" Thread Ended");
	}
}

class Beta extends Thread
{
	@Override 
	public void run()
	{
		String name = Thread.currentThread().getName();
		IO.println(name+" Thread Started");
		
		for(int i =1; i<=50; i++)
		{
			IO.println(i+" by "+name+" thread");
			
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				
			}
		}
		IO.println(name + " Thread ended");
		
	}
}

public class MultiThreading_Demo_5_Obj_CreationInSideTheNEWTread {

	public static void main(String[] args) 
	{
		IO.println("Main Thread Started");
		
		Alpha alpha = new Alpha();
		alpha.setName("Alpha");
		
		alpha.start();
		
		try
		{
			alpha.join();		
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		IO.println("Main Thread Ended");

	}

}
