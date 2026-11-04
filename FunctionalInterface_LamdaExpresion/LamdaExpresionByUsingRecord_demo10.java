package com.balia.interfaceLambdafunction;

/**
 * 
 * Student Marks Processing System
MediumCore Java • Functional Interfaces • Function50 Points
Report an issue
Description
university system processes student marks and converts them into results using Function functional interface.
Instead of writing logic directly, the transformation logic must be passed as a Function parameter to a method.

The system should:
Accept student marks
Convert marks into a result message
Display the processed result

Rules
Use Function<Integer, String>
Create a method that:
Accepts marks
Accepts a Function<Integer, String> as a parameter
The Function should:
Convert marks into result status
Call the method from main
Examples

Example 1:

Input

85

Output

Result Status: Distinction

Example 2:

Input

45

Output

Result Status: Pass

Explanation
Function<T, R> takes one input and returns one output.
Use apply() method inside the processing method.
Do not write grading logic directly in main.
 * 
 */
import java.util.Scanner;
import java.util.function.Function;

public class LamdaExpresionByUsingRecord_demo10 {

    public static void processMarks(
            int marks, Function<Integer, String> resultCalculator) {

        String result = resultCalculator.apply(marks);

        System.out.println("Result Status: " + result);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int marks = sc.nextInt();

        // Lambda expression for grading logic
        Function<Integer, String> f = m -> {
            if (m >= 75) {
                return "Distinction";
            } else if (m >= 40) {
                return "Pass";
            } else {
                return "Fail";
            }
        };

        // Passing Function as an argument
        processMarks(marks, f);

        sc.close();
    }
}