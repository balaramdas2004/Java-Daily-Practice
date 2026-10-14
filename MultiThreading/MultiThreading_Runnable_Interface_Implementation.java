package com.balia.MultiThreading;

class MultiThreading_Runnable_Interface_Implementation implements Runnable 
{
    public void run() 
    {
        System.out.println("Running");
    }

    public static void main(String[] args) 
    {
    	MultiThreading_Runnable_Interface_Implementation task = new MultiThreading_Runnable_Interface_Implementation();
        Thread t = new Thread(task);
        t.start();
    }
}