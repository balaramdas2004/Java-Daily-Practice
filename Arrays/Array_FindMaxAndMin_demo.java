/*
 * Description
Objective:
Write a Java program that reads an array of integers from the user and finds both the maximum and minimum values using two separate methods.

Input Format:
1. First line: An integer n denoting the number of elements in the array.
2. Next n lines: Each line contains one integer (array element).

Output Format:
- Print the maximum value in the array:
Maximum element is : <max_value>
- Print the minimum value in the array:
Minimum element is : <min_value>

Method Specifications:
Method name: findMaximum
Input: 1 int array
Output: int (maximum value)
Logic: For finding the maximum element in the array

Method name: findMinimum
Input: 1 int array
Output: int (minimum value)
Logic: For finding the minimum element in the array

Call both methods from main method to test your logic.
Examples

Example 1:

Input

Enter the size of the array: 
5 
Enter 5 elements: 
10 
20 
5 
30 
15

Output

Maximum element is : 30 
Minimum element is : 5

Example 2:

Input

Enter the size of the array: 
4 
Enter 4 elements: 
-5 
0 
25 
10

Output

Maximum element is : 25 
Minimum element is : -5
 */

package com.balia.array;

import java.util.*;

public class Array_FindMaxAndMin_demo 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array :");
        int size = sc.nextInt();
       // sc.nextLine();

        int []arr = new int[size];

        for(int i=0; i<size;i++)
        {
        	System.out.print("Enter the array element of index no "+" \" "+ i+"\" :");
            arr[i] = sc.nextInt();
            

        }

        //boolean isFound = false;
        int max=arr[0];
        int min =arr[0];
        for(int i=1; i<arr.length;i++)
        {   
            if(max<arr[i])
            {
                //isFound=true;
                max =arr[i];
                

            }
            else if(min>arr[i])
            {
                min = arr[i];
                
            }
                
        }
            System.out.println("Maximum element is : "+max);
            System.out.println("Minimum element is : "+min);
            
            sc.close();
    }
       
        
}


