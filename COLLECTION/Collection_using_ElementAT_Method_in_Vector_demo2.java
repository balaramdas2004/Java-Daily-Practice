package com.balia.collection;
import java.util.*;

public class Collection_using_ElementAT_Method_in_Vector_demo2 
{
	public static void main(String []args)
	{
		Vector<Integer> obj = new Vector<>();

		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);

		System.out.println(obj.elementAt(0));
		System.out.println(obj.elementAt(1));
		System.out.println(obj.elementAt(2));
		System.out.println(obj.elementAt(3));
	}

}
