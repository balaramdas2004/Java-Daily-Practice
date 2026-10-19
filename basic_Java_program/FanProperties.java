/*
 * Assignment 02
-------------
Write a Program on OOPs to define Fan class properties and behaviour.

properties/Field/Attribute :

name    : String
coil    : String
wings	: int

behaviour:

switchOn()  : public void
switchOff() : public void   

 */

//ELC
package com.balia.elc;

public class FanProperties {
	public static void main()
	{
		Fan smartFan = new Fan();
		//Initializing 
		smartFan.name = IO.readln("Enter the name of the Fan: ");
		smartFan.coil = IO.readln("Enter the Name of Coil:");
		smartFan.wings = Integer.parseInt(IO.readln("Enter the Number of wings: "));
		
		smartFan.getDetails();
		smartFan.switchOn();
		
		smartFan.switchOff();
	}

}
//BLC
class Fan
{
	String name;
	String coil;
	int wings;
	
	public void getDetails()
	{
		IO.println("Name of the Fan is :"+ name );
		IO.println("Name of the coil is :"+ coil);
		IO.println("Number of Wings is :"+ wings);
		
	}
	public void switchOn()
	{
		IO.println("The Fan is On");
	}
	public void switchOff()
	{
		IO.println("FAn is Off");
	}
}

