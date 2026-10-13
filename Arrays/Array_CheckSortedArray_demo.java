package com.balia.array;

/*
 * 
 * Problem Description

Write a program to check whether the given array is arranged in increasing order or not. The array is considered sorted other wise not sorted
->Take an array as input from user
->Compare each element with its next element
->Print true if sorted, false if not sorted
Examples
Example 1
Input:

Enter the size of array: 5
Enter 5 elements:
1 2 3 4 5

Output:

Array: 1 2 3 4 5 
Is sorted? true
 */

import java.util.Scanner;

public class Array_CheckSortedArray_demo
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int []arr = new int[size];
        System.out.print("Given Array: ");
        for(int i =0; i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
            System.out.print(arr[i]+" ");
        }
        boolean isFound = true;
        for(int i=0; i<arr.length;i++)
        {
            for(int j =i; j<arr.length;j++)
            {
                if(arr[i] > arr[j])
                {
                    isFound = false;
                    break;
                    
                }

            }
                    
        }
        System.out.println();

        if(isFound)
        {
            System.out.print("Is sorted? "+ isFound);
        }
        else
        {
            System.out.print("Is sorted? "+ isFound);
        }

        sc.close();
    }
}