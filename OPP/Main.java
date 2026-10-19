package com.balia.constructor;

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}

class Book
{
	String title;
	String author;
	double price;
	
	public Book(String title , String author, double price)
	{
		if(price<0)
		{
			System.err.println("Error: Book price cannot be Negative");
			System.exit(0);
		}
		this.title = title;
		this.author = author;
		this.price = price;
		
		
	}
	
}
