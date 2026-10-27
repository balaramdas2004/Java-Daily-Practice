package com.balia.collection;

import java.util.Vector;
import java.util.function.Consumer;


public class HOW_FOR_EACH_LOOP_work_Internnaly {

	public static void main(String[] args) 
	{
		Vector<String> listOfCity = new Vector<>(100);
		
		listOfCity.add("Hydrabad");
		listOfCity.add("Vizac");
		listOfCity.add("Pune");
		
		//Anonymous Inner class
		Consumer<String> cons = new Consumer<String>()
		{
			@Override
			public void accept(String city) 
			{
				IO.println(city);
				
			}
			
		};
		
		listOfCity.forEach(cons);
		
		
	}

}
