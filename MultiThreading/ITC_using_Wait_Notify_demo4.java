package com.balia.MultiThreading;

class Account
{
	private double balance = 10000;
	public synchronized void withdraw(double amount)
	{
		IO.println("Withdraw Method got the lock");
		try
		{
			if(balance < amount)
			{
				IO.println("Low balance calling dad to deposite the money");
				wait();
				IO.println("Ater notify , go to blocked state");			
			}
		}
		catch(InterruptedException e)
		{
			
		}
		
			if(balance < amount )
			{
				IO.println("Money is not sufficent please add minimum 50000 ");
				deposite(50000);
				
			}
			this.balance = balance - amount;
			IO.println("After withdraw the balance is :"+ this.balance);
		
	}
	
	public synchronized void deposite(double amount)
	{
		IO.println("Going for deposite");
		this.balance += amount;
		IO.println("After deposite money total balance is :"+ this.balance);
		notify();
	}
}

public class ITC_using_Wait_Notify_demo4 
{
	public static void main(String[] args) 
	{
		Account a = new Account();
		
		Thread son = new Thread()
		{
			@Override
			public void run()
			{
				a.withdraw(50000);
			}
		};
		son.start();
		
		Thread dad = new Thread()
		{
			@Override
			public void run()
			{
				a.deposite(10000);
			}
		};
		dad.start();
		

	}

}
