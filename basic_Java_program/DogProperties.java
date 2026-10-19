/*
 * Assignment 01
-------------
Write a Program on OOPs to define Dog class properties and behaviour.

properties/Field/Attribute :

name    : String
height  : double
age	: int

behaviour:

getDogInformation() : public void
             bark() : public void    

 */

//ELC
package com.balia.elc;

public class DogProperties 
{
	public static void main() 
	{
		Dog tomy = new Dog();
		//initializing the value of Dogs ;
		tomy.name = IO.readln("Enter the Dog name: ");
		tomy.height= Double.parseDouble(IO.readln("Enter the height of the Dog: "));
		tomy.age = Integer.parseInt(IO.readln("Enter the age of the Dog: "));
		//calling the method to 
		tomy.getDogInformation();
		tomy.bark();
	}

}

//BLC
class Dog
{
	String name;
	double height;
	int age;
	public void getDogInformation()
	{
		IO.println("Dog name is :"+ name);
		IO.println("Dog height is :"+ height+" inch");
		IO.println("Dog age is :"+ age);
	}
	public void bark()
	{
		IO.println( name  + " is barking.");
	}
}
