package com.balia.MultiThreading;

public class Enum_State_Using_demo
{

	public static void main(String[] args) throws InterruptedException
	{
		Thread t = new Thread();
		Thread.State s = t.getState();
		
		IO.println(s);
		t.start();
		Thread.State s1 = t.getState();
		t.wait();
		IO.println(s1);

	}

}
