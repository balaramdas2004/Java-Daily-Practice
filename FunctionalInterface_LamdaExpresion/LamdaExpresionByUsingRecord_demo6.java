package com.balia.interfaceLambdafunction;

/**
 * 
 * Simple Shopping Amount Calculator
EasyCore Java • Functional Interfaces • Function20 Points
Report an issue
Description
A basic shopping application calculates the total cost of items purchased.
The calculation logic must be written using the Function functional interface and passed to a separate method.

This question focuses on:
Understanding Function<T, R> 
Passing a Function as a method parameter 
Applying very simple logic

Rules
Use Function<Integer, Integer>
Create a method that:
Accepts price and quantity
Accepts a Function<Integer, Integer
Uses the Function to calculate total amount
Display the final amount

Input Format
Price
Quantity

Output Format
Display the total payable amount
Examples

Example 1:

Input

100 
3

Output

Total Amount = 300

Example 2:

Input

50
2

Output

Total Amount = 100

Explanation
The Function interface takes one input and returns one output.
Here, the Function will take quantity as input and return the total price.
The actual multiplication logic is passed as a lambda expression.
 * 
 */

import java.util.Scanner;
import java.util.function.Function;

public class LamdaExpresionByUsingRecord_demo6 {

    public static void calculateTotal(
            int price, int quantity,
            Function<Integer, Integer> calculate) {

        int total = calculate.apply(quantity);

        System.out.println("Total Amount = " + total);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int price = sc.nextInt();
        int quantity = sc.nextInt();

        Function<Integer, Integer> totalCalculator =
                q -> price * q;

        calculateTotal(price, quantity, totalCalculator);

        sc.close();
    }
}