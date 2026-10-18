package com.balia.MultiThreading;

class Demo extends Thread
{
	int val =0;
	@Override
	public void run()
	{
		synchronized(this)
		{
			IO.println("Child thread is got the lock");
			for(int i =1; i<10; i++)
			{
				val = val +i;
			}
			IO.println("task is completed by child thread, Send the notification");
			notify();
		}
	}
}

public class ITC_using_Wait_Notify_Demo3 {

	public static void main(String[] args) 
	{
		IO.println("main thread is Started!!!!!!!");
		
		Demo d = new Demo();
		d.start();
		
		
		synchronized(d)
		{
			IO.println("Main thread has aquired the lock");
			IO.println("Main thread is going for wait and release the lock");
			try
			{
				d.wait(); // lock is released;
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			IO.println("Main thread notified");
			IO.println("d.val");
		}
		
	}

}
