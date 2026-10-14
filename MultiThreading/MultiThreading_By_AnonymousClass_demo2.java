package com.balia.MultiThreading;

public class MultiThreading_By_AnonymousClass_demo2 
{
    public static void main(String[] args) 
    {
        Thread t = new Thread()
	{
	   @Override
	   public void run()
	   {
	      
	        for(int i=1; i<=10; i++)
	        {
	          System.out.println("i value is :"+i);
	          try
			  {
			    Thread.sleep(1000); // Here the flag Value = FALSE so is the interrupt method 
			    					//occurs then nothing is here to interrupted because its already Interrupted at fist 
			    					//here its running after Interrupted
			  }
			  catch(InterruptedException e)
			  {
			     System.out.println("Thread is interrupted");
			  }
	        }
	      
	   }
	};

        t.start();
        t.interrupt();
    }
}