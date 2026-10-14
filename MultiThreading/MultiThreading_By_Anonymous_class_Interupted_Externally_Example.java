package com.balia.MultiThreading;

public class MultiThreading_By_Anonymous_class_Interupted_Externally_Example 
{
    public static void main(String[] args) 
    {
        Thread t = new Thread()
	{
	   @Override
	   public void run()
	   {
	      try
	      {
	        for(int i=1; i<=10; i++)
	        {
	          System.out.println("i value is :"+i);
	          Thread.sleep(1000);
	        }
	      }
	      catch(InterruptedException e)
	      {
	         e.printStackTrace();
	      }
	   }
	};

        t.start();
        t.interrupt();
    }
}
