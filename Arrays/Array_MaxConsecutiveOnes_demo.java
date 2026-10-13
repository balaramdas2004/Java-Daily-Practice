package com.balia.array;
/*
 * Problem Description

Given an array that contains only 0s and 1s, find the longest sequence of consecutive 1s in the array."
->Take an array as input from user contains only 1 and 0
->Count how many 1s appear together without any 0 in between
->Print the maximum count of Consecutive Ones
Examples
Example 1
Input:

Enter the size of array (only 0s and 1s): 7
Enter 7 elements (0 or 1 only):
1 1 0 1 1 1 0

Output:

Array: 1 1 0 1 1 1 0 
Maximum consecutive ones: 3
 * 
 */


import java.util.Scanner;

public class Array_MaxConsecutiveOnes_demo
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Given Array: ");
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
            System.out.print(arr[i]+" ");
        }
        int count = 0;
        int maxCount = 0;
        for(int i =0; i<arr.length;i++)
        {
            if(arr[i] == 1)
            {
                count ++;
                if(count >maxCount)
                {
                    maxCount = count;
                }
                
            }
            else
            {
                count =0;
            }
        }
        System.out.println();
        System.out.print("Maximum consecutive ones: "+maxCount);
        sc.close();
    }
}