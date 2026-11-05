package com.balia.arrayComapareableAndComparator;

import java.util.Arrays;
import java.util.Comparator;

record Product(Integer id, String name, Double price)
{
	
}


public class Arrays_comparator_Insted_Of_comparable_Interface 
{
	public static void main(String []args)
	{
		Product [] products = new Product[3];
		
		products[0] = new Product(333,"Camera", 98000D);
		products[1] = new Product(222,"Laptop", 24000D);
		products[2] = new Product(111,"mobile", 45000D);
		
		IO.println("Original Data:");
		
		for(Product product :products)
		{
			IO.println(product);
		}
		
		IO.println("Sorting based on the ID:");
		
		//Anonymous inner class
		Comparator <Product> cmpId = new Comparator<Product>()
				{
					@Override
					public int compare(Product p1, Product p2) 
					{	
						return Integer.compare(p1.id(), p2.id());
					}
				};
		Arrays.sort(products,cmpId);
		
		for(Product product :products)
		{
			IO.println(product);
		}
		
		IO.println("Sorting based on the Name:");
		Comparator <Product> cmpname = new Comparator<Product>()
		{
			@Override
			public int compare(Product p1, Product p2) 
			{	
				return p1.name().compareTo(p2.name());
			}
		};
		
		Arrays.sort(products,cmpname);

		for(Product product :products)
		{
			IO.println(product);
		}
		
		IO.println("Sorting based on the Price: ");
		
		Comparator<Product> cmpPrice = new Comparator<Product>()
				{
					@Override
					public int compare(Product p1 , Product p2)
					{
						return Double.compare(p1.price(),p2.price());
					}
				};
		Arrays.sort(products, cmpPrice);
		for(Product product :products)
		{
			IO.println(product);
		}
	
	}

}
