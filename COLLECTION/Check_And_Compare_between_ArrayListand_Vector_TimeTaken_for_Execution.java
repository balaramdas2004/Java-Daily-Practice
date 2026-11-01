package com.balia.collection;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;

public class Check_And_Compare_between_ArrayListand_Vector_TimeTaken_for_Execution 
{
	public static void main(String []args)
	{
		final int ITERATION = 100000;
		
		Vector<Integer> v = new Vector<>();
		
		long startTime = System.currentTimeMillis();
		
		for(int i =0; i< ITERATION;i++)
		{
			v.add(i);
		}
		
		long endTime = System.currentTimeMillis();
		
		IO.println("Time taken to execute the Loop: "+ (endTime - startTime));
		
		ArrayList<Integer> a = new ArrayList<>();
		
		startTime = System.currentTimeMillis();
		for(int i =0; i<ITERATION; i++)
		{
			a.add(i);
		}
		endTime = System.currentTimeMillis();
		IO.println("Time taken to execute the Loop: "+ (endTime - startTime));
		
		Stack <Integer> s = new Stack<>();
		
		startTime = System.currentTimeMillis();
		
		for(int i =0; i<ITERATION; i++)
		{
			s.push(i);
		}
		endTime = System.currentTimeMillis();
		IO.println("Time taken to execute the Loop: "+ (endTime - startTime));
		
	}

}
