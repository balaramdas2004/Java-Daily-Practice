package com.balia.interfaceLambdafunction;
/**
 * 
 * Driving License Eligibility System
EasyCore Java • Functional Interfaces • Predicate20 Points
Report an issue
Description
A government transport department evaluates whether a citizen is eligible to apply for a driving license. 
Instead of traditional conditional logic, the eligibility rules must be implemented using the Predicate functional interface. 
Create a Citizen class with age and eyesightScore. Use Predicate<Citizen> to check eligibility. 
Input Format: Age, Eyesight Score. 
Output Format: Display eligibility result.
Examples

Example 1:

Input

20
7

Output

Eligible for License

Example 2:

Input

15
8

Output

Not Eligible for License

Explanation
Predicate.test() evaluates conditions and returns boolean result.
 * 
 */

import java.util.Scanner;
import java.util.function.Predicate;

class Citizen {
    private int age;
    private int eyesightScore;

    public Citizen(int age, int eyesightScore) {
        this.age = age;
        this.eyesightScore = eyesightScore;
    }

    public int getAge() {
        return age;
    }

    public int getEyesightScore() {
        return eyesightScore;
    }
}

public class LamdaExpresionByUsingRecord_demo4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        int eyesightScore = sc.nextInt();

        Citizen citizen = new Citizen(age, eyesightScore);

        Predicate<Citizen> eligibility = c ->
                c.getAge() >= 16 && c.getEyesightScore() >= 6;

        if (eligibility.test(citizen)) {
            System.out.println("Eligible for License");
        } else {
            System.out.println("Not Eligible for License");
        }

        sc.close();
    }
}