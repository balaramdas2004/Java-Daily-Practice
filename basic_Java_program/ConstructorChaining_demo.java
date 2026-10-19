package com.balia.constructor;

class Parent
{
	public Parent()
	{
		super();
		System.out.println("Parent Constructor");
		display();
	}
	
	void display()
	{
		System.out.println("parent class display method");
	}
}

public class ConstructorChaining_demo extends Parent
{
	public ConstructorChaining_demo()
	{
		super();
		
		System.out.println("Child class Constructor");
		
	}
	
	@Override
	void display()
	{
		System.out.println("child class display");
	}

	public static void main(String[] args) 
	{
		ConstructorChaining_demo obj = new ConstructorChaining_demo();

	}

}
