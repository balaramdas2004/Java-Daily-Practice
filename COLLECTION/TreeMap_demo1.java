package com.balia.collection;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMap_demo1 {

	public static void main(String[] args) 
	{
		SortedMap<Object , Object> tm1 = new TreeMap<>();
		
		tm1.put("One", 1);
		tm1.put("Two", null);
		tm1.put("Three", tm1);
		
		displayMap(tm1);
		tm1.forEach((k,v) -> IO.println(k+" : "+ v));

	}
	
	static void displayMap(SortedMap<Object,Object> tm1)
	{
		Iterator<Entry<Object, Object>> itr = tm1.entrySet().iterator();
		itr.forEachRemaining(IO::println);
	}

}
