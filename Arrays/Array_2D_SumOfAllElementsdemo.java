package com.balia.array;
/*
 * 
 * Description
Write a Java program to input a 2D array (3x3 matrix) from the user and calculate the sum of all elements.
This program demonstrates how to iterate through a 2D array to perform aggregate operations.

Input:
- 9 integer elements representing a 3x3 matrix

Output:
- Print the sum of all the elements in the matrix

Example:
Input:
1 2 3
4 5 6
7 8 9

Output:
Sum of all elements = 45
Examples

Example 1:

Input

1 
2 
3 
4 
5 
6 
7 
8 
9

Output

Sum of all elements = 45

Example 2:

Input

10 
10 
10 
10 
10 
10 
10 
10 
10

Output

Sum of all elements = 90

Explanation
Each element of the matrix is added using nested loops to compute total sum.
Constraints

    Fixed size 3×3 matrix
 */

import java.util.*;

public class Array_2D_SumOfAllElementsdemo {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int [][]arr = new int[3][3];
        for(int i=0; i<arr.length;i++)
        {
            for(int j=0; j<arr.length;j++)
            {
                arr[i][j] = sc.nextInt();

            }
        }
        int sum =0;
        for(int i=0; i<arr.length;i++)
        {
            for(int j=0; j<arr.length;j++)
            {
                sum = sum+arr[i][j];
                
            }
        }
        System.out.print("Sum of all elements = "+sum);

        sc.close();
        // Write your code here
        
    }
}
