package com.balia.collection;

/**
 * 
 * Check Student Enrollment
EasyCore Java • List Interface • ArrayList20 Points
Report an issue
Description
Check if Student is Enrolled

Description:
A university course maintains a list of enrolled students. Your task is to check whether a particular student is enrolled in that course.

Sample Data:

Enrolled students list: ["Swati", "Sam", "Sonali"]
Student to check: "Sam"


Task:
Create a list containing the enrolled students.
Check if the student "Sam" is present in the list.
Print true if the student is enrolled, otherwise print false.
Examples

Example 1:

Input

Sam

Output

1

Example 2:

Input

Rahul

Output

false

Explanation
The program creates a list of students and checks membership using List.contains() which returns a boolean value.
 * 
 */

import java.util.*;

public class ArrayList_second_demo1 {
    public static void main(String[] args) 
    {
        ArrayList <String> t = new ArrayList<>();

        t.add("Swati");
        t.add("Sam");
        t.add("Sonali");

        String name = IO.readln();
        
        IO.println(t.contains(name));
        
    }
}
