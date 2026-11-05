package com.balia.arrayComapareableAndComparator;

import java.util.Arrays;

public class Arrays_Comparator_Interface_useComapreTo_method_forStringComparision 
{
	public static void main(String []args)
	{
		Integer number[] = {90,56,12,45,34};
		
		Arrays.sort(number,(p1, p2)->p1.compareTo(p2));
		
		IO.println(Arrays.toString(number));
		
		Arrays.sort(number,(p1, p2)->p2.compareTo(p1));
		IO.println(Arrays.toString(number));
		
		String [] fruits = {"Oranges","Mango","Grapes","Apple"};
		
		Arrays.sort(fruits,(s1,s2)->s1.compareTo(s2));
		IO.println(Arrays.toString(fruits));
	}
}
