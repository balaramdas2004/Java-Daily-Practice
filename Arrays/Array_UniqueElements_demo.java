package com.balia.array;
/*
 * 
 * Problem Description

WAP to find the unique element in the array.
Write a program to:

Accept the size of an array from the user

Accept array elements from the user

Display the original array

Find  the Unique Elements in array
   ->Invoke a separate method that will perform to find the Unique elements operation on the array.
 ->  public static void findUniqueElements(int[] arr)

Display the Unique Elements in array
Examples
Example 1
Input:

Enter the size of array: 7
Enter 7 elements:
Element 1: 1
Element 2: 2
Element 3: 3
Element 4: 2
Element 5: 4
Element 6: 5
Element 7: 1

Output:

Input Array: [1, 2, 3, 2, 4, 5, 1]
Unique Elements: 3 4 5
 * 
 */
import java.util.Arrays;
import java.util.Scanner;

public class Array_UniqueElements_demo
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int [size];
        for(int i =0; i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Input Array: "+Arrays.toString(arr));
        System.out.println();

        System.out.print("Unique Elements are: ");

        boolean isFound = false;
        for(int i =0; i<arr.length;i++)
        {
            boolean isUnique = true;
            for(int j =0;j<arr.length; j++)
            {
                if(arr[i] == arr[j] && i!= j)
                {
                    isUnique = false;
                    break;
                }
            }
 
            if(isUnique)
            {
                System.out.print(arr[i]+" ");
                isFound = true;
            } 
        }
        if(!isFound)
        {
            System.out.print("No unique elements found");
        }
        sc.close();
    }
}