package com.balia.MultiThreading;

public class MultiThreading_DeadLock_demo 
{
	public static void main(String[] args) throws InterruptedException
	{
		IO.println("Main thread Started");
		Thread t = Thread.currentThread();
		
		for(int i =0; i<=10; i++)
		{
			IO.println(i +" by "+t.getName()+" thread ");
			Thread.sleep(1000);
		}
		
		t.join();
		
		IO.println("Main Thread ended");
	}

}
