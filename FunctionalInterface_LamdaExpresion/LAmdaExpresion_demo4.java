package com.balia.interfaceLambdafunction;

import java.util.Scanner;

@FunctionalInterface
interface VoterEligibility {
    boolean check(int age);
}

public class LAmdaExpresion_demo4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        VoterEligibility obj = (a) -> a >= 18;

        boolean result = obj.check(age);

        if (result) {
            System.out.println("Eligible to Vote");
        } else {
            System.out.println("Not Eligible to Vote");
        }

        sc.close();
    }
}


