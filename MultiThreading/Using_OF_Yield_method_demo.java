package com.balia.MultiThreading;

class Yield implements Runnable
{
	@Override
	public void run()
	{
		String name = Thread.currentThread().getName();
		for(int i =1; i<10; i++)
		{
			IO.println(i+" by "+ name+" Thread");
			
			if(name.equals("child1"))
			{
				Thread.yield();
				
			}
		}
	}
}

public class Using_OF_Yield_method_demo {

	public static void main(String[] args) 
	{
		Yield task =new Yield();
		Thread t1 = new Thread (task,"child1");
		Thread t2 = new Thread (task,"child2");
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		
		


	}

}
