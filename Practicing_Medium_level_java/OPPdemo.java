package com.balia.opp;

import java.util.Scanner;

public class OPPdemo 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
		System.out.print("Enter your name:");
		String name = sc.nextLine();
		System.out.print("Enter your age");
		int age = sc.nextInt();
		System.out.print("Enter your grade");
		String grade = sc.nextLine();
		grade = sc.nextLine();
		
		Student value =Student.createStudentObject(name, age, grade);
		IO.println(value);
		
		System.out.println("Do u want to continue:");
		String choice = sc.nextLine();
		
		
		if (choice.equalsIgnoreCase("No"))
		{
			System.exit(0);
		}
		
		}
		
	}

}

class Student
{
	private String name;
	private int age;
	private String grade;
	
	private Student (String name, int age, String grade)
	{
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
	public static Student createStudentObject(String name, int age, String grade)
	{
		Student s1 = new Student(name,age,grade);
//		IO.println(s1);
		return s1;
	}
	
	public String toString()
	{
		return "Name of the Student"+this.name+"\nAge of the Student:"+this.age+"\nGrade is :"+this.grade;
	}
}