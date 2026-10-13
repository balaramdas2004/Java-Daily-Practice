/*
 * 
 * 
 * Description
Write a java program to find the element given by user is present in the array or not , If the element is present in the array also
programmer have to print index position of that searching element.
If the user pass the element for searching in the array is not present
then also provide a appropriate message to the user that element is not present inside the array.

Input 1:-
[1,2,3,4,5,6,7]

Enter the number you want to search : 5
Output :-
The element which you have searched is present inside the 4th index 

Input 2:-
[1,2,3,4,3,6]

Enter the number you want to search : 9

Output :
The element which you have searched is not present inside the Array. 

Note: Write the logic to search the element inside a method and give the 
result back from the method to the calling place 
Method name:- searchElement
Argument:- 2 array type
i) 1st 1-D array (int [] arr1)
ii) The element which the user want to search.(int element)
Return type:- int type
Logic :-search the array element and return if available return the 
index and if not return -1;

Take the input from the user in main method and call the method from there and get the result back from the method and then print the result based on requirement.
Examples

Example 1:

Input

Enter number of elements in the array: 7 
Enter elements: 
1 2 3 4 5 6 7 
Enter the number you want to search: 5

Output

The element which you have searched is present inside the 4th index

Example 2:

Input

Enter number of elements in the array: 6 
Enter elements: 
1 2 3 4 3 6 

Enter the number you want to search: 9

Output

The element which you have searched is not present inside the Array.
 */

package com.balia.array;

import java.util.*;

public class Array_SearchingOperationInArray_demo {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i =0; i<arr.length;i++)
        {
        	System.out.print("Enter the array element of index no "+" \" "+ i+"\" :");
        	arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number you want to search :");
        int number = sc.nextInt();
        
        boolean isFound = false;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==number)
            {

                isFound = true;
                System.out.print("The element which you have searched is present inside the "+i+" th index");
                break;
            }
        }

        if(!isFound)
        {
            System.out.println("The element which you have searched is not present inside the Array.");
        }
        sc.close();
    }
}

