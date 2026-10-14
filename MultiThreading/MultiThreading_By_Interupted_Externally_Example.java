package com.balia.MultiThreading;

class Ram extends Thread
{
	@Override
   public void run()
   {
      try
      {
        for(int i=1; i<=10; i++)
        {
          System.out.println("i value is :"+i);
          Thread.sleep(1000);   //Flag = False , this is false because when the Interrupted Interrupted
          						//The sleep thread Flag is convert to FALSE
        }
      }
      catch(InterruptedException e)
      {
         e.printStackTrace();
      }
   }
}


public class MultiThreading_By_Interupted_Externally_Example 
{
    public static void main(String[] args) 
    {
        Ram t = new Ram();
        t.start();
        t.interrupt(); // Flag = true, when we call the interrupt method then a flag value is automatically created as TRUE
    }
}
