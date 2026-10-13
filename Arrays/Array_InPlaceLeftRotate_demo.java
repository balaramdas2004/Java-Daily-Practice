package com.balia.array;

/*
 * Problem Description


Problem Title: In-Place Left Rotation of an Array by One
Problem Statement:
Write a Java program that reads an array of integers from the user and performs a left rotation by one position.
In a left rotation, the first element moves to the end, and all other elements shift one position to the left.

The rotation must be done in-place, meaning no extra arrays should be used.

Input Format:
An integer n representing the size of the array.

n space-separated integers representing the array elements.

Output Format:
Print the array after performing the left rotation by one position, with elements separated by a space.


Sample Input:

Enter size of array: 5
Enter 5 integers:
Element 1: 10
Element 2: 20
Element 3: 30
Element 4: 40
Element 5: 50
Sample Output:

Array after left rotation:
20 30 40 50 10

Let me know if you'd like to add:

Multiple rotations (k positions)
Examples
Example 1
Input:

4
1
2
3
4

Output:

Array after left rotation:
2 3 4 1


 */


import java.util.Scanner;

public class Array_InPlaceLeftRotate_demo
{
    public static int[] leftRotation(int[] arr)
    {
        int [] newArr = new int[arr.length];
        for(int i=1; i<newArr.length;i++)
        {
            newArr[i-1] = arr[i];
        }
        newArr[newArr.length-1] = arr[0];
        return newArr;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int []arr = new int[size];
        for(int i =0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        int [] result = leftRotation(arr);
        System.out.println("Array after left rotation:");
        for(int results : result)
        {
            System.out.print(results+" ");
        }
        sc.close();
    }
}
