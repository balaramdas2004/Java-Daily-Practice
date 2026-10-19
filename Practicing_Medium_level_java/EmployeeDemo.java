
/*Program 02:
-----------
Format :
---------
EmployeeDemo.java (File name)
----------------------------
//ELC
public class EmployeeDemo
{
   void main()
    {
    }
}

//BLC
class Employee
{
   //Properties
        +
   //Behaviour 
}

Write a Program on OOPs to define Employee class properties and behaviour.

properties/Field/Attribute :

employeeId : int
employeeName : String
employeeSalary : double

Initialize these properties with the help of method using parameter variable.

behavior/Method:
setEmployeeData(int id, String name, double salary) : public void
getEmployeeData() : public void

*/
//Elc

package com.balia.Opp2;

public class EmployeeDemo 
{
	public static void main()
	{
		Employee e1 = new Employee();
		
		int id = Integer.parseInt(IO.readln("Enter the Employee ID :"));
		String name = IO.readln("Enter Name of the Employee: ");
		double salary = Double.parseDouble(IO.readln("Enter the Employee Salary: "));
		
		
		e1.setEmployeeData(id, name, salary);
		e1.getEmployeeDetails();
	}

}
//BLC
class Employee
{
	int employeeId;
	String employeeName;
	double employeeSalary;
	
	public void setEmployeeData(int id , String name, double salary)
	{
		employeeId = id;
		employeeName = name;
		employeeSalary= salary;
		
	}
	public void getEmployeeDetails()
	{
		IO.println("Employee ID is :"+employeeId);
		IO.println("Employee Name is :"+employeeName);
		IO.println("Employee Salary is :"+employeeSalary);
		
	}
	
	
}




