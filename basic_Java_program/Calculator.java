/*
 Assignment - 02
================
Calculator Program :
 
Name of the BLC class : Calculator

       Name of method : add()
      Access Modifier : public, static
            Parameter : two parameters of type integer
          Return type : an integer value 
After calculation return the addition of two numbers.

       Name of method : sub()
      Access Modifier : public, static
            Parameter : two parameters of type integer
          Return type : an integer value 
After calculation return the subtraction of two numbers.

       Name of method : mul()
      Access Modifier : public, static
            Parameter : two parameters of type integer
          Return type : an integer value 
After calculation return the multiplication of two numbers.

       Name of method : div()
      Access Modifier : public, static
            Parameter : two parameters of type integer
          Return type : a double value 
After calculation return the division of two numbers.

Create an ELC class called ArithmeticCalculator with main method to test the application. Here take two inputs from the Scanner class to perform add, sub, mul and div.

 */
package blc;

public class Calculator 
{
	public static int add(int num1 , int num2)
	{
		int sum = num1 + num2;
		return sum;
	}
	public static int sub(int num1, int num2)
	{
		int substract = num1 - num2 ;
		return substract;
	}
	public static int mul(int num1, int num2)
	{
		int multiple = num1 * num2 ;
		return multiple;
	}
	public static int div(int num1, int num2)
	{
		int division = num1 / num2 ;
		return division;
	}

}
