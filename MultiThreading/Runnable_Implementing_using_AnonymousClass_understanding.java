package com.balia.MultiThreading;

class Runnable_Implementing_using_AnonymousClass_understanding 
{
    public static void main(String[] args) throws InterruptedException 
    {
        Runnable task = new Runnable() 
        {
            @Override
            public void run() 
            {
                System.out.print("Hello");
            }
        };

        Thread t = new Thread(task);

        System.out.println(t.isAlive());

        t.start();
        t.join();

        System.out.println(t.isAlive());
    }
}