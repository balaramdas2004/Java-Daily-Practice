package com.balia.MultiThreading;

public class DEADLOCK_DEMO2_MULTIthreading {

	public static void main(String[] args) 
	{
		String resourse1 = new String("Java"); //R1
		String resourse2 = new String("HTML"); //R2
		// t1 tries to lock resourse1(R1) then resourse2(r2)
		Thread t1 = new Thread()
		{
			@Override
			public void run()
			{
				synchronized (resourse1)
				{
					IO.println("Thread 1: locked resources 1");
					try
					{
						Thread.sleep(1000);
					}
					catch(Exception e)
					{
						
					}
					//t1 thread is waiting here for lock2 (blocked state)
				synchronized(resourse2)//nested Synchronized block
				{
					IO.println("Thread 1: locked resourse 2");
				}
				}
			}
		};

		
		Thread t2 = new Thread()
		{
			@Override
			public void run()
			{
				synchronized (resourse2)
				{
					IO.println("Thread 2: locked resources 2");
					try
					{
						Thread.sleep(1000);
					}
					catch(Exception e)
					{
						
					}
					//t2 thread is waiting here for lock1 (blocked state)
				synchronized(resourse1)//nested Synchronized block
				{
					IO.println("Thread 2: locked resourse 1");
				}
				}
			}
		};
		
		t1.start();
		t2.start();
	}

}
