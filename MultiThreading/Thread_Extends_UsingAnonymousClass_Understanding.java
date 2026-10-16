package com.balia.MultiThreading;

class Thread_Extends_UsingAnonymousClass_Understanding 
{
    public static void main(String[] args) throws InterruptedException 
    {
        Thread t = new Thread() 
        {
            @Override
            public void run() 
            {
                System.out.print("Hello");
            }
        };

        System.out.println(t.isAlive());

        t.start();
        t.join();

        System.out.println(t.isAlive());
    }
}