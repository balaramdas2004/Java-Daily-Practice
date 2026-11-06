package com.balia.collection;

import java.util.HashMap;

public class HashMap_putMethod_demo2 {

	public static void main(String[] args) 
	{
		HashMap <String, Integer> hm1 = new HashMap<>();
		hm1.put("A", 1);
		hm1.put("A", 2);
		hm1.put(new String("A"),3);
		
		System.out.println("Size is: "+hm1.size());
		
		IO.println(hm1);
		
		IO.println("..........................");
		
		HashMap<Integer,Integer> hm2 = new HashMap<>();
		
		hm2.put(128, 1);
		hm2.put(128, 2);
		
		
		IO.println("Size is :"+hm2.size());
		IO.println(hm2);
		IO.println("..........................");
		
		HashMap<Object, Object> hm3 = new HashMap<>();
		
		hm3.put(hm1, hm2);
		hm3.put(hm2, hm1);
		IO.println("Size is :"+hm3.size());
		IO.println(hm3);
		
		IO.println("..........................");
		
		HashMap<Object, Object> hm4 = new HashMap<>();
		
		hm4.put("A", 1);
		hm4.put("A", 2);
		hm4.put(new String("A"), 3);
		hm4.put(65, 4);
		IO.println("Size is :"+hm4.size());
		IO.println(hm4);
		
	}

}
