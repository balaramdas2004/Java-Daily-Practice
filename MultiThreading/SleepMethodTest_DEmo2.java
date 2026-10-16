package com.balia.MultiThreading;

class Rammma extends Thread 
{ 
	public synchronized void display() 
	{ 
		System.out.println(Thread.currentThread().getName() + " starts");
		try
		{
			Thread.sleep(2000); 
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " ends"); 
	} 
} 

public class SleepMethodTest_DEmo2 
{ 
	public static void main(String[] args) 
		{ 
			Rammma task = new Rammma(); 
	
			Thread t1 = new Thread(() -> task.display(), "Thread-1"); 
			Thread t2 = new Thread(() -> task.display(), "Thread-2"); 
	
			t1.start(); 
			t2.start(); 
		} 
}