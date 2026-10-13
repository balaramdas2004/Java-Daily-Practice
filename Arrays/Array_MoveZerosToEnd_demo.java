package com.balia.array;
/*
 * Problem Description

Problem: Move All Zeros to the End
Problem Statement:
Write a Java program that moves all the zeros in an array to the end, while maintaining the relative order of non-zero elements.

Your program must:

Accept 5 test cases from the user.

For each test case:

Read the array size.

Accept the elements of the array.

Display the original array.

Move all zeros to the end of the array.

Print the modified array.

Input Format:
For each test case:

Second line contains n integers (both zero and non-zero values).

Output Format:
For each test case:

Print "Original Array: " followed by the input array.

Then print "After Moving Zeros to End: " followed by the modified array.
Examples
Example 1
Input:

5
0
1
0
3
12

Output:

Original Array: 0 1 0 3 12 
Array After Moving Zeros to End: 1 3 12 0 0
 * 
 */

import java.util.Scanner;
public class Array_MoveZerosToEnd_demo
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int []arr =  new int [size];
        System.out.print("Original Array: ");
        for(int i =0; i<arr.length;i++)
        {
            arr[i]= sc.nextInt();
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        System.out.print("Array After Moving Zeros to End: ");
        int temp =0;
        for(int i =0; i<arr.length;i++)
        {
            for(int j =i+1;j<arr.length;j++)
            {
                if(arr[i] == 0)
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }


        }
        for(int arrs :arr)
        {
            System.out.print(arrs+" ");
        }
        sc.close();

    }
}