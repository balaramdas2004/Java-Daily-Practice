package com.balia.method;

import java.util.*;

public class Factorial_Calculation_demo
{
    public static long iterative(int n)
    {
        long fact =1;
        for(int i =1; i<=n; i++)
        {
            fact = fact *i;
        }
        return fact;
    }

    public static long recursive(int n)
    {
        if(n<=1)
        return 1;
        
        return n* recursive(n-1);   
    }

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println("Iterative: "+iterative(n));
        System.out.println("Recursive: "+recursive(n));
        sc.close();
    }
}