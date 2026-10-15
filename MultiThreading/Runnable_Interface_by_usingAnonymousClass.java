package com.balia.MultiThreading;

public class Runnable_Interface_by_usingAnonymousClass {

	public static void main(String[] args) 
	{
		
		Runnable r1 = new Runnable()
				{
					@Override
					public void run()
					{
						String name = Thread.currentThread().getName();
						IO.println("Current Thread name is :"+name);
					}
				};
		
		
		Thread t1 = new Thread(r1);
		t1.start();

	}

}
