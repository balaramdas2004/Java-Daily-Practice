package com.balia.interfaceLambdafunction;

import java.util.Scanner;

@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

public class LAmdaExpresion_demo2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        Calculator obj = (x, y) -> x + y;

        int result = obj.calculate(a, b);

        System.out.println("Result = " + result);

        sc.close();
    }
}