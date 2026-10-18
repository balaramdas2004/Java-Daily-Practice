package com.balia.MultiThreading;

class ITCThread extends Thread
{
	int val = 0;
	@Override
	public void run()
	{
		for(int i =1; i<10; i++)
		{
			val += i ;
			try
			{
				Thread.sleep(2000);
				IO.println(val);
			}
			catch(InterruptedException e)
			{
				
			}
		}
		
		IO.println(val);
	}
}

public class ITC_Demo2 {

	public static void main(String[] args) throws InterruptedException
	{
		ITCThread t = new ITCThread();
		
		t.start();
		
		Thread.sleep(100);
		/**
		 * here the val value may be different different because its selected by
		 * CPU so value is changing 
		 */
		IO.println("val value by main thread is:"+ t.val);

	}

}
