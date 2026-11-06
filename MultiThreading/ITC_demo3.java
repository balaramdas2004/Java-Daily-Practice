package com.balia.MultiThreading;

class Accountss
{
    private int balance = 0;

    public synchronized void withdraw(int amount) throws InterruptedException 
    {
        while (balance < amount) 
        {
            System.out.println("Insufficient balance. Please wait for deposit.");
            wait();
        }

        balance = balance - amount;

        System.out.println("Amount withdrawn: " + amount);
        System.out.println("Remaining balance: " + balance);
    }

    public synchronized void deposit(int amount) 
    {
        System.out.println("Amount is being deposited...");

        balance = balance + amount;

        System.out.println("Amount deposited: " + balance);

        notifyAll();
    }
}

public class ITC_demo3 
{
    public static void main(String[] args) 
    {
        Accountss account = new Accountss();

        // Drawer Thread using Anonymous Inner Class

        Runnable drawer = new Runnable() 
        {
            @Override
            public void run() 
            {
                int[] amounts = {100, 1500, 600, 2000};

                for (int amount : amounts) 
                {
                    try 
                    {
                        account.withdraw(amount);

                        Thread.sleep(1000);
                    } 
                    catch (InterruptedException e) 
                    {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
            }
        };

        // Depositor Thread using Anonymous Inner Class

        Runnable depositor = new Runnable() 
        {
            @Override
            public void run() 
            {
                int[] dAmounts = {200, 1000, 600, 2000, 5000};

                for (int amount : dAmounts) 
                {
                    account.deposit(amount);

                    try 
                    {
                        Thread.sleep(1000);

                    } 
                    catch (InterruptedException e) 
                    {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
            }
        };

        // Creating Thread objects

        Thread t1 = new Thread(drawer);
        Thread t2 = new Thread(depositor);

        // Starting both threads

        t1.start();
        t2.start();
    }
}