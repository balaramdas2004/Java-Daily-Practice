/*
 * 
 * Description
Write a program in java to store elements in an array and print it.
Input 10 elements in the array :
element - 0 : 1
element - 1 : 1
element - 2 : 2

.......

and so on.
Expected Output :
Elements in array are: 1 1 2 3 4 5 6 7 8 9

Note: Take the input from the user and read and print the element inside the main method only.
Examples

Example 1:

Input

Input 10 elements in the array: 
element - 0: 1 
element - 1: 1 
element - 2: 2 
element - 3: 3 
element - 4: 4 
element - 5: 5 
element - 6: 6 
element - 7: 7 
element - 8: 8 
element - 9: 9

Output

Elements in array are: 1 1 2 3 4 5 6 7 8 9

Example 2:

Input

Input 5 elements in the array: 
element - 0: 10 
element - 1: 20 
element - 2: 30 
element - 3: 40 
element - 4: 50

Output

Elements in array are: 10 20 30 40 50
 */

package com.balia.array;

import java.util.*;

public class Array_StoreAndPrintArrays_demo {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        int size = sc.nextInt();
        int arr[] = new int[size];
        
        for(int i =0; i<arr.length; i++)
        {
        	System.out.print("Enter the array element of index no "+" \" "+ i+"\" :");
            arr[i] = sc.nextInt();
            
        }
        System.out.print(" "+Arrays.toString(arr));
        sc.close();
    }
}

