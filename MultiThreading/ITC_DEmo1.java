package com.balia.MultiThreading;

public class ITC_DEmo1 {

	public static void main(String[] args) 
	{
		Object obj = new Object();
		try 
		{
			obj.wait();
		} 
		catch (InterruptedException e) 
		{
			
			e.printStackTrace();
		}

	}

}
