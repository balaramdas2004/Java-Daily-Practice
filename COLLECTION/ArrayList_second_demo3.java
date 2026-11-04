package com.balia.collection;

/**
 * 
 * Remove Failed Students
MediumCore Java • List Interface • ArrayList50 Points
Report an issue
Description
You are given a list of student scores. A student is considered failed if their score is less than 40.
Your task is to remove all failed students from the list, leaving only the scores of students who passed.

What You Will Learn:
How to use removeIf() method

How to filter elements from a list based on a condition (Predicate)

Sample Data:

List<Integer> scores = new ArrayList<>(Arrays.asList(35, 85, 23, 76, 55));

Expected Output:

Filtered: [85, 76, 55]
(All scores less than 40 are removed.)

Hint:
Use the removeIf(Predicate<? super E> filter) method to remove elements matching a condition.
Examples

Example 1:

Input

Enter number of students: 5 
35 
85 
23 
76 
55

Output

Filtered: [85, 76, 55]

Example 2:

Input

Enter number of students: 4 
10 
50 
30 
70

Output

Filtered: [50, 70]

Explanation
The program iterates over the list and removes scores below 40 using removeIf().
Constraints

    Scores should be non-negative integers
 * 
 */
import java.util.*;

public class ArrayList_second_demo3 {
    public static void main(String[] args) 
    {
        ArrayList<Integer> t = new ArrayList<>();
        
        int noOfStudent = Integer.parseInt(IO.readln().trim());

        for(int i =0; i<noOfStudent;i++)
        {
            Integer number = Integer.valueOf(IO.readln().trim());
            t.add(number);
        }
        
        t.removeIf(s -> s < 40);
        IO.println("Filtered: "+t);
    }
}
