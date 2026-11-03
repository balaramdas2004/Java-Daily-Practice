package com.balia.interfaceLambdafunction;

import java.util.Scanner;

@FunctionalInterface
interface GreetingService {
    void greet(String name);
}

public class LAmdaExpresion_demo1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        GreetingService obj = (n) -> {
            System.out.println("Hello " + n + ", Welcome!");
        };

        obj.greet(name);

        sc.close();
    }
}