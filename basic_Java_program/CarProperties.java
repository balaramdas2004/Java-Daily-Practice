/*
 * Assignment 03
--------------
Write a Program on OOPs to define Car class properties and behaviour.

properties/Field/Attribute :

name    : String
model   : int
color	: String

behaviour:

getCarInformation()  : public void
             drive() : public void   

 */

//ELC
package com.balia.elc;

public class CarProperties {
	public static void main()
	{
		Car BMW = new Car();
		//Initializing
		BMW.name = IO.readln("Enter the Car Name : ");
		BMW.model = Integer.parseInt(IO.readln("Enter the Model Number: "));
		BMW.color = IO.readln("Enter the Color name: ");
		
		BMW.getCarInformation();
		BMW.drive();
		
	}

}
//BLC
class Car
{
	String name ;
	int model;
	String color;
	
	public void getCarInformation()
	{
		IO.println("My car Name is :"+ name);
		IO.println("Car model is : "+ model);
		IO.println("Car color is : "+ color);
	}
	public void drive()
	{
		IO.println("I am Driving my "+color+" "+name+" Car");
	}
}
