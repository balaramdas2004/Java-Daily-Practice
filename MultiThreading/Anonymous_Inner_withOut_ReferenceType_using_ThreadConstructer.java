package com.balia.MultiThreading;

public class Anonymous_Inner_withOut_ReferenceType_using_ThreadConstructer {

	public static void main(String[] args) 
	{
		
		Thread t1 = new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				String name = Thread.currentThread().getName();
				IO.println("Current Thread name is :"+name);
			}
		});
		
		t1.setName("AizenThread");
		t1.start();
	}

}
