package com.balia.MultiThreading;


public class MultiThreading_demo3 extends Thread 
{
    public void run()
    {
        for (int i = 0; i < 3; i++) 
        {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) 
    {
    	MultiThreading_demo3 t1 = new MultiThreading_demo3();
    	MultiThreading_demo3 t2 = new MultiThreading_demo3();
        t1.start();
        t2.start();
        
    }
}
