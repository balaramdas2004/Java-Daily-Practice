package com.balia.interfaceLambdafunction;

/**
 * 
 * Salary to Tax Category Converter
EasyCore Java • Functional Interfaces • Function20 Points
Report an issue
Description
An HR system converts salary into a tax category using Function<Double, String>. Rules: salary ≥ 10L -> High Tax, ≥ 5L -> Medium Tax, else Low Tax. 
Input Format: Annual Salary. 
Output Format: Tax category.
Examples

Example 1:

Input

1200000

Output

High Tax

Example 2:

Input

600000

Output

Medium Tax

Explanation
Function converts numeric input to text result.
 * 
 */
import java.util.Scanner;
import java.util.function.Function;

public class LamdaExpresionByUsingRecord_demo9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salary = sc.nextDouble();

        Function<Double, String> taxCalculator = s -> {
            if (s >= 1000000) {
                return "High Tax";
            } 
            else if (s >= 500000) {
                return "Medium Tax";
            } 
            else {
                return "Low Tax";
            }
        };

        String result = taxCalculator.apply(salary);

        System.out.println(result);

        sc.close();
    }
}