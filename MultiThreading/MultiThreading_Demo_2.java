package com.balia.MultiThreading;


class MultiThreading_Demo_2 extends Thread 
{
	
	
	public  void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args)
	{
		MultiThreading_Demo_2 t1 = new MultiThreading_Demo_2();
		t1.setName("MyThread");
		t1.start();
	}
}



