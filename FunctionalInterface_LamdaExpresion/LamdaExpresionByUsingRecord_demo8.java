package com.balia.interfaceLambdafunction;

/**
 * 
 * OTP Generation System
EasyCore Java • Functional Interfaces • Supplier20 Points
Report an issue
Description
A secure authentication system generates a one-time password using Supplier functional interface. 
The OTP must be generated without any input parameter. 
Input Format: None. 
Output Format: Display generated OTP.
Examples

Example 1:

Output

Generated OTP: ******

Example 2:

Output

Generated OTP: ******

Explanation
Supplier.get() supplies data without input.
Constraints

    OTP must be 6 digits
 * 
 */

import java.util.function.Supplier;
import java.util.Random;

public class LamdaExpresionByUsingRecord_demo8 
{
    public static void main(String[] args) 
    {

        Random random = new Random();

        // Supplier to generate a 6-digit OTP
        Supplier<String> otpGenerator = () ->
                String.format("%06d", random.nextInt(1000000));

        // Generate OTP using get()
        String otp = otpGenerator.get();

        System.out.println("Generated OTP: " + otp);
    }
}