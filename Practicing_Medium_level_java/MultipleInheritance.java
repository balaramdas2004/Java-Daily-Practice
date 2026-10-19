package com.balia.interfaceLambdafunction;

interface lambda 
{	
	void draw();
}
interface Beta
{
	void draw();
}

class Ram implements Beta, lambda
{
	public void draw()
	{
		IO.println("multiple inheritance is posible using interface");
	}
}

public class MultipleInheritance
{
	public static void main(String [] args)
	{
		Ram r = new Ram();
		r.draw();
	}
}