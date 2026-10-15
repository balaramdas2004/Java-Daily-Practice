package com.balia.MultiThreading;

class Test implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("child thread is running");
	}
}

public class MultiThrading_ImplementRunnableClass_DEmo1 
{
	public static void main (String [] args)
	{
		Thread t = new Thread (new Test());
		t.start();
	}

}
