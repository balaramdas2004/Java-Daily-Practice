package com.balia.MultiThreading;

class Even extends Thread
{
	@Override
	public void run()
	{
		IO.println("Even Thread Started");
		String name = Thread.currentThread().getName();
		
		for(int i =2; i<=10; i=i+2)
		{
			IO.println("Even Number "+i+" by "+name+" Thread");
			
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				
			}
		}
		IO.println("Even Thread is dead");
	}
}

class Odd extends Thread
{
	@Override
	public void run()
	{
		IO.println("Odd thread is Started");
		String name = Thread.currentThread().getName();
		
		for(int i =1; i<=10;  i= i+2)
		{
			IO.println("Odd number "+i+" by "+name);
			
			try
			{
				Thread.sleep(1000);				
				
			}
			catch(InterruptedException e)
			{
				
			}
		}
		IO.println("Odd thread ended");
		
		
	}
}

public class MultiThreading_Demo_4 
{
	public static void main(String[] args) 
	{
		IO.println("Main Tread Started");
		
		Even even = new Even();
		Odd odd =new Odd();
		
		even.setName("Even");
		odd.setName("Odd");
		
		even.start();
		try
		{
			even.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		IO.println("Main Thread Rewakup");
		odd.start();
		IO.println("Main Thread ended!!!");

	}

}
