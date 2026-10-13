package com.balia.array;

/*
 * 
 * Description

Write a program to input and display a jagged array with 3 rows of varying lengths.
The jagged array must contain exactly 3 rows.
Each row can have a different length.
The program should read elements row-wise and then display them in matrix form.

Input Format
Enter the number of elements for each row (3 rows).
Enter the elements for each row based on its size.

Output Format
Display the jagged array row by row.
Examples

Example 1:

Input

Enter number of elements in row 1: 
3 
Enter elements of row 1: 
1 2 3 

Enter number of elements in row 2: 
2 
Enter elements of row 2: 
4 5 

Enter number of elements in row 3: 
4 
Enter elements of row 3: 
6 7 8 9

Output

Jagged Array Elements: 
1 2 3 
4 5 
6 7 8 9

Example 2:

Input

Enter number of elements in row 1: 
1 
Enter elements of row 1: 
10 

Enter number of elements in row 2: 
3 
Enter elements of row 2: 
20 30 40 

Enter number of elements in row 3: 
2 
Enter elements of row 3: 
50 60

Output

Jagged Array Elements: 
10 
20 30 40 
50 60

Explanation
First, create a jagged array with 3 rows.
For each row:
Ask the user how many elements that row contains.
Create a 1D array of that size.
Read elements into it.
Finally, use nested loops to print all elements row-wise.
 */
import java.util.Scanner;

public class Array_2D_InputPrintJaggedArray_demo 
{
    
	
	public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][];

        for (int i = 0; i < 3; i++) 
        {
        	IO.print("Enter the size of cols:");
            int size = sc.nextInt();

            if (size <= 0) 
            {
                System.out.println("Invalid input");
                return;
            }

            arr[i] = new int[size];

            IO.print("enter cols values :");
            for (int j = 0; j < size; j++)
            {	
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < 3; i++)        
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            
            System.out.println();
            
        }
        
        sc.close();
    }
}