package com.balia.array;
/*
 * Description
write a program to insert an element at last. write  separate method for it and call the method from main method. 
method : int[] insertAtLast(int[] a, int element)
Examples

Example 1:

Input

5
1 2 3 4 5
100

Output

1 2 3 4 5 100

Example 2:

Input

4
2 3 4 5
78

Output

2 3 4 5 78
 */
import java.util.*;

public class Array_insert_element_at_last_demo {
    public static int[] insertAtLast(int[] a, int element)
    {
        int[] newArray = new int[a.length+1];

        for(int i=0;i< a.length;i++)
        {
            newArray[i] = a[i];
        }

        newArray[a.length] = element;

        return newArray;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int [] arr = new int [size];

        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        int lastNum = sc.nextInt();

        int[] result = insertAtLast(arr,lastNum);
        
        for(int i =0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }
        sc.close();
    }

}
