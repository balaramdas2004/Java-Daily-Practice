package com.balia.MultiThreading;

enum Result
{
	PASS,FAIL,PENDING
}

public class Enum_Understanding_demo2 
{

	public static void main(String[] args) 
	{
		Result r = Result.PASS;
		if(r == Result.PASS)
		{
			IO.println("Student is "+r);
		}

	}

}
