package com.balia.collection;

import java.util.Collection;
import java.util.HashMap;

public class HashMap_getOrDefault_ContainKey_entrySet_method_demo {

	public static void main(String[] args) 
	{
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Vanilla");
		map.put(2, "Butterscotch");
		map.put(3,  "Chocolate");
		map.put(4, "Cotton Candy");
		
		IO.println(map);
		
		IO.println("Using forEach() Method:");
		map.forEach((key,value) -> IO.println(key+" : "+value));
		
		for(Integer key : map.keySet())//keySet retrieve the key from the HAshTable 
		{
			IO.println("Key is : "+ key);
		}
		
		//This collection reference type Store the data in arrays  
		Collection<String> values = map.values();
		IO.println("All Values are : ");
		IO.println(values);
		
		Integer keys = 3;
		
		//getKey () method find take the key and retrieve the value from the HashTable
		IO.println("Value of Key "+ keys +"is : "+map.get(keys));
		
		keys = 6;
		IO.println("Values of key"+ keys +" is : "+map.getOrDefault(keys, "Key is not available"));	}

}
