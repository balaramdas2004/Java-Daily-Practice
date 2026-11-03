package com.balia.interfaceLambdafunction;


import java.util.Scanner;

@FunctionalInterface
interface BonusCalculator {
    double calculateBonus(double salary, int rating);
}

public class LAmdaExpresion_demo3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salary = sc.nextDouble();
        int rating = sc.nextInt();

        BonusCalculator obj = (s, r) -> {
            if (r >= 4) {
                return s * 0.20;
            } 
            else if (r == 3) {
                return s * 0.10;
            } 
            else {
                return 0.0;
            }
        };

        double bonus = obj.calculateBonus(salary, rating);

        System.out.println("Bonus Amount = " + bonus);

        sc.close();
    }
}