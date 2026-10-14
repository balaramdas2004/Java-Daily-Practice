package com.balia.MultiThreading;


public class MultiThreading_By_AnonymousClass_demo3 
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
			    Thread.sleep(1000); // Flag = False
			  }
			  catch(InterruptedException e)
			  {
			     System.out.println("Thread is interrupted");
			     Thread.currentThread().interrupt(); 	//Flag = true  Here again the flag value become True ,
			     										//when we Call the Interrupted method its became True 
			     										//so here the Exception repeated every time.
			  }
	        }
	      
	   }
	};

        t.start();
        t.interrupt(); //Flag = True
    }
}
