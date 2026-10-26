package com.balia.collection;

import java.util.*;
class Collection_VectorCalss_demo
{
	public static void main(String args[])
	{
		Vector obj = new Vector(4,2);
		
		obj.addElement(new Integer(3));
		obj.addElement(new Integer(2));
		obj.addElement(new Integer(5));
		
		System.out.println(obj.elementAt(1));
	}
}
