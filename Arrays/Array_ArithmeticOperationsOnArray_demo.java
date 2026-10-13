/*
 * 
 * Description
Problem: ArithmeticOperationsOnArray
Objective:
Write a Java program to compute the sum of all elements stored in an integer array. Your program should take the number of elements, read each element, store them in an array, and pass this array to a method getArraySum. This method should compute and return the sum of the array elements.

Input Format:
First line: An integer n representing the number of elements in the array.

Next n lines: Each line contains an integer, which is an element of the array.

Output Format:
Print:
Sum of all elements stored in the array is : <sum>
Examples

Example 1:

Input

Enter the size of the array: 
5 
Enter 5 elements: 
1 
2 
3 
4 
5

Output

Sum of all elements stored in the array is : 15

Example 2:

Input

Enter the size of the array: 
4 
Enter 4 elements: 
10 
20 
30 
40

Output

Sum of all elements stored in the array is : 100

Explanation
The program reads the number of elements n
Stores n integers in an array
Passes the array to getArraySum()
The method computes and returns the sum
The result is printed in the required format
 */

package com.balia.array;

import java.util.*;

public class Array_ArithmeticOperationsOnArray_demo {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        int size = sc.nextInt();
        sc.nextLine();
        int []arr = new int[size];
        int sum =0;
        for(int i=0; i<size;i++)
        {
        	System.out.print("Enter the array element of index no "+" \" "+ i+"\" :");
            arr[i]=sc.nextInt();
            sum = sum+arr[i];
        }
        System.out.println("Sum of all elements stored in the array is : "+sum);
        
        sc.close();
    }
}
