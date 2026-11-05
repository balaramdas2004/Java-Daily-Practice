package com.balia.arrayComapareableAndComparator;

import java.util.Arrays;

record Employee (Integer id, String name)implements Comparable<Employee>
{

	@Override
	public int compareTo(Employee e2) 
	{
		return Integer.compare(this.id, e2.id);
	}
	
}

public class Array_UsigRecord_forStudentAdmition 
{ 
	public static void main(String[] args) 
	{
		Employee[] employees = new Employee[3];
		
		
		employees[0] = new Employee(222, "Zaheer");
		employees[1] = new Employee(333, "Aryan");
		employees[2] = new Employee(111, "Raj");
		
		IO.println("Before sorting: \n"+ Arrays.toString(employees));
		
		Arrays.sort(employees);
		IO.println("After sorting: \n"+ Arrays.toString(employees));

	}

}
