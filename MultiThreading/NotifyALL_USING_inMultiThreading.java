package com.balia.MultiThreading;

class Resource
{
	private boolean flag = false;
	
	public synchronized void waitMethod()
	{
		IO.println(Thread.currentThread().getName()+" Waiting");
		while(!flag)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		IO.println(Thread.currentThread().getName()+" Thread is completed");
	}
	
	public synchronized void setMethod()
	{
		IO.println(Thread.currentThread().getName()+" notifyAll");
		this.flag = true;
		IO.println(Thread.currentThread().getName()+" has make flag value as a true");
		notifyAll();
	}
}

public class NotifyALL_USING_inMultiThreading 
{

	public static void main(String[] args) 
	{
		Resource c = new Resource();
		
		Thread t1 = new Thread(()-> c.waitMethod(),"child1");
		Thread t2 = new Thread(()-> c.waitMethod(),"child2");
		Thread t3 = new Thread(()-> c.waitMethod(),"child3");
		
		t1.start();
		t2.start();
		t3.start();
		
		Thread s1 = new Thread(()->c.setMethod(),"Setter_Thread");
		s1.start();
	}
	

}
