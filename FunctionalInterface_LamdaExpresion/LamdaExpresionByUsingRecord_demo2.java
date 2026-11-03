package com.balia.interfaceLambdafunction;

/**
 * 
 * PredicateDemo
easyCore Java • Functional Interfaces • Predicate20 Points
Report an issue
Description
*Write a Java program that defines a method testPredicate to test a given number against a provided predicate.
class name CalculationLogic(ELC) :

Method name : testPredicate
Access Modifier : public
Non-Access Modifier : static
return type : boolean
parameters : int, Predicate<Integer>
This method should return a boolean value indicating whether the given number satisfies the provided predicate.


In the main method:
Define three predicates:
isEven: Checks if a given number is even.
isGreaterThanTen: Checks if a given number is greater than 10.
isPrime: Verify the given number is prime or not.

Define a sample integer number (e.g., 18).
Test each predicate using the testPredicate method and print the result indicating whether the number satisfies each predicate.
Examples

Example 1:

Input

18

Output

18 is even: true
18 is greater than 10: true
18 is prime: false

Example 2:

Input

6

Output

6 is even: true
6 is greater than 10: false
6 is prime: false
 * 
 * 
 */
import java.util.Scanner;
import java.util.function.Predicate;

public class LamdaExpresionByUsingRecord_demo2 {

    public static boolean testPredicate(int num, Predicate<Integer> p) {
        return p.test(num);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        // Predicate to check even number
        Predicate<Integer> isEven = n -> n % 2 == 0;

        // Predicate to check greater than 10
        Predicate<Integer> isGreaterThanTen = n -> n > 10;

        // Predicate to check prime number
        Predicate<Integer> isPrime = n -> {
            if (n <= 1) {
                return false;
            }

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }

            return true;
        };

        System.out.println(num + " is Even: "
                + testPredicate(num, isEven));

        System.out.println(num + " is Greater Than 10: "
                + testPredicate(num, isGreaterThanTen));

        System.out.println(num + " is Prime: "
                + testPredicate(num, isPrime));

        sc.close();
    }
}