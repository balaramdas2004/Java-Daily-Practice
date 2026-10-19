package com.balia.opp;

import java.util.Scanner;

public class EmployeeOPPDemo 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.print("Enter the name:");
			String name = sc.nextLine();
			System.out.print("Enter the ID:");
			int id = Integer.parseInt(sc.nextLine());
			System.out.print("Enter the department:");
			String department = sc.nextLine();
			System.out.print("Enter the salary:");
			double salary = Double.parseDouble(sc.nextLine());
			
			
			Employee value = Employee.createEmployeeObject(name, id, department, salary);
			IO.println(value);
			
			IO.println("Do you want to continue:");
			String choice = sc.nextLine();
			
			if(choice.equalsIgnoreCase("No"))
			{
				System.exit(0);
			}
		}

	}

}

class Employee
{
	private String name;
	private int id;
	private String department;
	private double salary;
	
	private Employee(String name,int id,String department,double salary)
	{
		this.name= name;
		this.id = id;
		this.department= department;
		this.salary= salary;
	}
	
	public static Employee createEmployeeObject(String name,int id,String department,double salary)
	{
		
		Employee e1 = new Employee(name,id,department,salary);
		return e1;
	}
	
	public double calculateAnnualSalary()
	{
		double anualSalary = this.salary*12;
		double bonus = switch(this.department.toUpperCase())
		{
		case "SALES"-> anualSalary * 0.10;
		case "ENGINEERING"-> anualSalary * 0.15;
		case "HR" -> anualSalary * 0.08;
		default -> anualSalary *0.05;
		
		};
		return anualSalary+bonus;
	}
	
	public String toString()
	{
		return "Enter Department (Sales, Engineering, HR, Other): "+this.name+"\nID: "+this.id+"\nName:"+this.name+"\nDepartment: "+this.department+"\nMonthly Salary: "+this.salary+"/nAnualSalary:"+this.calculateAnnualSalary();
	}
}