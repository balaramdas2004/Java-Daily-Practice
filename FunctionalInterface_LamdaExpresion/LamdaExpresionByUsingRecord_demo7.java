package com.balia.interfaceLambdafunction;

/**
 * 
 * Number Square Calculator
EasyCore Java • Functional Interfaces • Function20 Points
Report an issue
Description
A basic math utility application calculates the square of a number.
The calculation logic must be implemented using the Function functional interface and passed to a separate method.

This question helps beginners understand:
What a Function<T, R> is
How to pass a Function as a parameter
How to use the apply() method

Rules
Use Function<Integer, Integer>
Create a method that:
Accepts an integer number
Accepts a Function<Integer, Integer>
Applies the function to calculate the square
Print the squared value

Input Format
--------------------
A single integer number

Output Format
----------------------
Display the square of the number
Examples

Example 1:

Input

6

Output

Square = 36

Example 2:

Input

4

Output

Square = 16

Explanation
The Function interface takes one input and returns one output.
Here, the Function takes a number and returns its square.
The actual logic is written inside a lambda expression.
 * 
 */

import java.util.Scanner;
import java.util.function.Function;

public class LamdaExpresionByUsingRecord_demo7 {

    public static void calculateSquare(
            int number, Function<Integer, Integer> square) {

        int result = square.apply(number);

        System.out.println("Square = " + result);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        // Lambda expression to calculate square
        Function<Integer, Integer> f = n -> n * n;

        // Passing Function as an argument
        calculateSquare(num, f);

        sc.close();
    }
}