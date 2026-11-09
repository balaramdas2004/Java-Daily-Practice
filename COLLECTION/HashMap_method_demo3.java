package com.balia.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

record Students(Integer id, String name)
{
	
}


public class HashMap_method_demo3 {

	public static void main(String[] args) 
	{
		HashMap<Integer, String > newmap1 = new HashMap<>();
		HashMap<Integer, String > newmap2 = new HashMap<>();
		
		newmap1.put(1, "OCPJP");
		newmap1.put(2, "is");
		newmap1.put(3, "best");
		
		newmap2.put(4, "exam");
		newmap2.put(5, "by Oracle");
		
		IO.println("By using putAll() method:");
		newmap1.putAll(newmap2);
		IO.println(newmap1);
		
		Set<Integer> keySet = newmap1.keySet();
		IO.println("All keys are : "+keySet);
		
		Collection<String> value = newmap1.values();
		IO.println("All the values in map2: "+value);
		
		HashMap<Students, String> studentMap = new HashMap<>();
		
		studentMap.put(new Students(111,"Scott"), "Hydrabad");
		studentMap.put(new Students(222,"Smith"), "Hydrabad");
		studentMap.put(new Students(333,"Allen"), "Hydrabad");
		studentMap.put(new Students(444,"Black"), "Hydrabad");
		
		HashMap<Students, String> duplicateMap = new HashMap<>(studentMap);
		duplicateMap.forEach((k,v)-> IO.println(k+" : "+v));
		
	}

}
