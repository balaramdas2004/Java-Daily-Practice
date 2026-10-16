package com.balia.MultiThreading;

/**
 * Most of the time the thread having highest priority will complete its task 
 * but we can't say that it will always complete its task first that means Thread scheduler dominates Priority
 * of the Thread .
 * Thread scheduler is responsible to Schedule the thread ;
 */
class Priority implements Runnable
{
	@Override
	public void run()
	{
		Thread t = Thread.currentThread();
		/*int count =0;
		for(int i =1; i<1000;i++)
		{
			count++;
		}*/
		IO.println("Completed thread name is :"+t.getName()+" and its Priority is:"+t.getPriority());
	}
}

public class TreadPrioriry_Demo {

	public static void main(String[] args) 
	{
		Priority test = new Priority();
		Thread t1 = new Thread(test,"First");
		Thread t2 = new Thread(test,"Last");
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();

	}

}
