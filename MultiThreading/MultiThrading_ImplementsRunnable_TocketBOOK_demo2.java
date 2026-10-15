package com.balia.MultiThreading;

class Tatkal implements Runnable
{
	@Override
	public void run()
	{
		String name = Thread.currentThread().getName();
		IO.println("Cangratulation! "+name+" your ticket is booked under Tatkal Scheme");
	}
}

class PremiumTatkalTicket implements Runnable
{
	@Override
	public void run()
	{
		String name = Thread.currentThread().getName();
		IO.println("Cangratulation! "+name+" your ticket is booked under PrimumTatkalTicket Scheme");
	}
}

public class MultiThrading_ImplementsRunnable_TocketBOOK_demo2 {

	public static void main(String[] args) 
	{
		Thread aizen = new Thread(new Tatkal()," AIZEN");
		Thread naruto = new Thread(new PremiumTatkalTicket(),"NARUTO");
		aizen.start();
		naruto.start();

	}

}
