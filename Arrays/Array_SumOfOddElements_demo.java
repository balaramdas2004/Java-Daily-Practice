/*
 * WAPT read an int array from user and print sum of odd elements
 */

package com.balia.array;

import java.util.*;

public class Array_SumOfOddElements_demo {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        IO.println("Enter the size of the array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
       
        for(int i=0; i<arr.length; i++)
        {
        	IO.println("Enter the value for "+i+" th element:");
            arr[i] = sc.nextInt();
        }
        
        int sum = 0;
        for(int i=0; i<arr.length;i++)
        {
            if(arr[i] %2 != 0)
            {
                
                sum += arr[i];
            }
        }
        System.out.println("The sum of odd number is :"+sum);
        sc.close();
    }
}
