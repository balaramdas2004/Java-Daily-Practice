package com.balia.interfaceLambdafunction;

/**
 * 
 * Flight Booking Seat Eligibility
MediumCore Java • Functional Interfaces • Predicate50 Points
Report an issue
Description
An airline wants to check whether a passenger is eligible for an emergency-exit seat.
The eligibility rules are:

age must be greater than or equal to 18

assistanceRequired must be false

Use a Predicate<Passenger> to perform this check and print the eligibility result.

Class Details

BLC class name: Passenger

Variables

age (int)

assistanceRequired (boolean)

Utility logic

Use Predicate<Passenger> to verify the eligibility condition.

ELC class name: Main

Input Format

First line: passenger age
Second line: assistanceRequired (true / false)

Output Format

If the passenger is eligible

Eligible for emergency exit seat


Otherwise

Not eligible for emergency exit seat
Examples

Example 1:

Input

25
false

Output

Seat Allowed

Example 2:

Input

40
true

Output

Seat Not Allowed

Explanation
The program creates a Passenger object and uses a Predicate<Passenger> to check the rule:
age ≥ 18 and assistanceRequired is false.
Based on the predicate result, the eligibility message is printed.
 * 
 */
import java.util.Scanner;
import java.util.function.Predicate;

// BLC class
class Passenger {
    private int age;
    private boolean assistanceRequired;

    public Passenger(int age, boolean assistanceRequired) {
        this.age = age;
        this.assistanceRequired = assistanceRequired;
    }

    public int getAge() {
        return age;
    }

    public boolean isAssistanceRequired() {
        return assistanceRequired;
    }
}

// ELC class
public class LamdaExpresionByUsingRecord_demo3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        boolean assistanceRequired = sc.nextBoolean();

        Passenger p = new Passenger(age, assistanceRequired);

        Predicate<Passenger> eligibility = passenger ->
                passenger.getAge() >= 18 &&
                !passenger.isAssistanceRequired();

        if (eligibility.test(p)) {
            System.out.println("Seat Allowed");
        } else {
            System.out.println("Seat Not Allowed");
        }

        sc.close();
    }
}