package com.balia.array;

/*
 * 
 * Description
write a program to insert the element at given index. write a separate method and call the method from main method.
method : int[] isertAtGivenIndex(int[]a, int element, int index)
Examples

Example 1:

Input

4
3
4
5
6
100
2

Output

3 4 100 5 6

Example 2:

Input

5
1 1 2 2 3 
40
3

Output

1 1 2 40 2 3
 * 
 */
import java.util.*;

public class Array_Inserting_element_at_givenindex {

    public static int[] isertAtGivenIndex(int [] a, int element,int index)
    {
        int [] newArr = new int[a.length +1];

        for(int i=0; i<newArr.length;i++)
        {
            if(i<index)
            {
                newArr[i] = a[i];
            }
            else if(i == index)
            {
                newArr[i] = element;
            }
            else
            {
                newArr[i] = a[i-1];
            }
        }
            return newArr;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        if(size <= 0)
        {
            System.out.print("Array size must be greater than 0.");
        }
        else
        {
            int [] arr = new int[size];
        for(int i = 0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        int element = sc.nextInt();
        
        int index = sc.nextInt();
        

        int[] result = isertAtGivenIndex(arr,element,index);
        for(int i=0; i<result.length;i++)
        {
            System.out.print(result[i] + " ");
        }
        sc.close();
        }
        
    }
}

