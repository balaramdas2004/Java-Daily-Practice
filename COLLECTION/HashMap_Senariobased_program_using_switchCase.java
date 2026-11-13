package com.balia.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class HashMap_Senariobased_program_using_switchCase 
{
	public static void main(String[] args) 
	{
		HashMap<String,List<String>> hm1 =  new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		
		int choice;
		
		do {
			System.out.println("\n--- Course Registration Menu ---");
	        System.out.println("1. Register student to course");
	        System.out.println("2. Remove student from course");
	        System.out.println("3. View course-wise student list");
	        System.out.println("4. Exit");
			System.out.println("Enter ur choice :");
			choice = sc.nextInt();
			sc.nextLine();
			
			
			
			switch(choice)
			{
				case 1->
				{
					System.out.println("Enter course Name: ");
					String course = sc.nextLine();
					
					System.out.println("Enter student Name: ");
					String sName = sc.nextLine();
					
					hm1.computeIfAbsent(course, key -> new ArrayList<>()).add(sName);
					
					System.out.println(sName + " registered to "+ course);				
					
				}
				
				case 2 ->
				{
					System.out.println("Enter the course Name: ");
					String course = sc.nextLine();
					
					System.out.println("Enter the Student Name to Remove :");
					String sName = sc.nextLine();
					
					boolean [] flag = {false};
					
					hm1.computeIfPresent(course, (k,v)->{
						flag[0] = v.remove(sName);
						
						return v.isEmpty() ? null : v;
					});
					
					if(flag[0])
					{
						System.out.println(sName+" has been removed from "+ course);
					}
					else
					{
						System.out.println("No course or Student found");
					}
				}
				
				case 3 ->
				{
					System.out.println("\nCourse -> Students List: ");
					
					if(hm1.isEmpty())
					{
						System.out.println("No course Registered");
					}
					else
					{
						hm1.forEach((k,v) -> System.out.println(k+"->"+v));
					}
				}
				
				case 4 ->
				{
	            	System.out.println("Exiting Course Registration System.");
				}
	            default ->
	            {
	            	System.out.println("Invalid choice. Please try again.");
	            }
			}
		}
		while(choice !=4);
		
		sc.close();
		
		

	}

}
