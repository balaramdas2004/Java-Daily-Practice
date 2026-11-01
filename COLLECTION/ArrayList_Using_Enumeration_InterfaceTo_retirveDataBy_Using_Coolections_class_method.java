package com.balia.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class ArrayList_Using_Enumeration_InterfaceTo_retirveDataBy_Using_Coolections_class_method 
{
	public static void main(String[] args) 
	{
		ArrayList<Object > cities = new ArrayList<>();
		cities.add("Hydrabad");
		cities.add("Delhi");
		cities.add("Banglore");
		cities.add("Chennai");
		
		/**Enumeration<Object> t = cities.elements();
		 * 
		 * 
		 * this is not a vector class so element() is not found so compilation error show
		 * 
		 * if u want to use Enumeration is ArrayList then u have to use Enumeration Object 
		 * using Collections Class method ("  Collection.enumeration(ArrayList<Object> object)  ") 
		 */
		
		Enumeration<Object> t=   Collections.enumeration(cities);
		while(t.hasMoreElements())
		{
			IO.println(t.nextElement());
		}
		
	}	

}
