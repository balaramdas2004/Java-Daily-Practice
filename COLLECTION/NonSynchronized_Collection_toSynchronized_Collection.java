package com.balia.collection;

import java.util.*;

public class NonSynchronized_Collection_toSynchronized_Collection {

	public static void main(String[] args) 
	{
		ArrayList<String > cities = new ArrayList<>();
		cities.add("Hydrabad");
		cities.add("Delhi");
		cities.add("Banglore");
		cities.add("Chennai");
		
		List<String> synchronizedList= Collections.synchronizedList(cities);
		
		synchronizedList.forEach(IO::println);
		
		IO.println("Using List Iterator we retrive data from Forward and Backward direction");
		ListIterator <String>listIterator = synchronizedList.listIterator();
		
		IO.println("By Forward Direction");
		
		while(listIterator.hasNext())
		{
			IO.println(listIterator.next());
		}
		
		IO.println("By using BackWard Direction");
		
		while(listIterator.hasPrevious())
		{
			IO.println(listIterator.previous());
		}

	}

}
