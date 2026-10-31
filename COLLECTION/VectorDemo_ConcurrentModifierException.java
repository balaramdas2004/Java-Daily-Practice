package com.balia.collection;

import java.util.Vector;

record Employee(Integer id, String name, Double salary)
{
	
}

public class VectorDemo_ConcurrentModifierException 
{
	public static void main(String []args)
	{
		Vector<Employee> listOfEmployee = new Vector<>();
		
		listOfEmployee.add(new Employee(101,"Scoot",78890.90));
		listOfEmployee.add(new Employee(102,"Smith",98890.90));

		listOfEmployee.add(new Employee(103,"John",88890.90));

		listOfEmployee.add(new Employee(104,"Alen",68890.90));
		listOfEmployee.add(new Employee(105,"Sanju",99990.90));
		
		IO.println("Original Object");
		for(Employee employee : listOfEmployee)
		{
			IO.println(employee);
		}
		Integer id = Integer.valueOf(IO.readln("Enter the id to be delete:"));
		
		for(Employee employee: listOfEmployee)
		{
			if(employee.id().equals(id))
			{
				listOfEmployee.remove(employee);
				break;
			
			}
		}
		
		IO.println("Remaining Object after deleting :");
		listOfEmployee.forEach(IO::println);

	}
}
