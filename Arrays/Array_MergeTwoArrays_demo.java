package com.balia.array;
/*
 * 
 * Description
Write a program in java to merge two arrays of same size sorted in descending order.

Test Data :
Input the number of elements to be stored in the first array :3
Input 3 elements in the array :
element - 0 : 1
element - 1 : 2
element - 2 : 3


Input the number of elements to be stored in the second array :3
Input 3 elements in the array :
element - 0 : 1
element - 1 : 2
element - 2 : 3

Expected Output :
The merged array in descending order is :
3 3 2 2 1 1

Note: Write the logic of merging two array element inside the method and also return the merge array elements through that method to the calling place.

Method name:- mergeArrays
Argument:- 2 array type
i) 1st 1-D array (int [] arr1)
ii)2nd 1-D array (itn [] arr2)

Return type:- int [] array
Logic :-Merge two array element and return the merge array 

Take the input from the user in main method for two different array
call the method from the main and get the result back and display 
it from main.
Examples

Example 1:

Input

Enter the number of elements for first array: 3
Enter 3 elements:
1
2
3

Enter the number of elements for second array: 3
Enter 3 elements:
1
2
3

Output

The merged array in descending order is: 
3 3 2 2 1 1

Example 2:

Input

Enter the number of elements for first array: 3
Enter 3 elements:
4 5 6

Enter the number of elements for second array: 4
Enter 4 elements:
3 2 6 7

Output

Both array size must be same.

Explanation
Merges two arrays, sorts the result in descending order and prints
 */
import java.util.*;

public class Array_MergeTwoArrays_demo {

    public static int[] mergeSort(int[] a, int[] b)
    {

        int [] newArr = new int[a.length+b.length ];

        for(int i=0; i<a.length;i++)
        {
            newArr[i] = a[i];
        }

        for(int i = 0; i<b.length;i++)
        {
            newArr[a.length + i] = b[i];
        }
        int temp =0;
        for(int i=0;i<newArr.length-1;i++)
        {
            for(int j=i+1;j<newArr.length;j++)
            {
                if(newArr[i]< newArr[j])
                {
                    temp = newArr[i];
                    newArr[i] = newArr[j];
                    newArr[j] = temp;

                }
            }
        }
        return newArr;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int size1 = sc.nextInt();

        int [] arr1 = new int[size1];
        for(int i=0; i<arr1.length;i++)
        {
            arr1[i] = sc.nextInt();
        }

        int size2 = sc.nextInt();
        int [] arr2 = new int[size2];

        for(int i=0; i<arr2.length;i++)
        {
            arr2[i] = sc.nextInt();
        }
        if(size1 != size2)
        {
            System.out.println("Error: Both arrays must be of the same size.");
        }
        else
        {
            int[] result = mergeSort(arr1,arr2);
            System.out.print("The merged array in descending order is : ");
            for(int i= 0; i<result.length; i++)
            {
                System.out.print(result[i]+" ");
            }
        }
        sc.close();
    }
}
