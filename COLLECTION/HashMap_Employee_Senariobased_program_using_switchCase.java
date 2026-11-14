package com.balia.collection;

import java.util.*;

public class HashMap_Employee_Senariobased_program_using_switchCase {

    public static void main(String[] args) {

        HashMap<String, List<String>> employees = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n--- Employee Management System ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Display Employees");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1 -> {

                    System.out.print("Enter Department Name: ");
                    String department = sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    String employee = sc.nextLine();

                    employees.computeIfAbsent(
                        department, key -> new ArrayList<>()
                    ).add(employee);

                    System.out.println(
                        employee + " added to " + department + " department."
                    );
                }

                case 2 -> {

                    System.out.print("Enter Department Name: ");
                    String department = sc.nextLine();

                    System.out.print("Enter Employee Name to Remove: ");
                    String employee = sc.nextLine();

                    boolean[] removed = {false};

                    employees.computeIfPresent(department, (key, empList) -> {

                        removed[0] = empList.remove(employee);

                        return empList.isEmpty() ? null : empList;
                    });

                    if (removed[0]) {
                        System.out.println(
                            employee + " removed from " + department + " department."
                        );
                    } else {
                        System.out.println("Employee or department not found.");
                    }
                }

                case 3 -> {

                    System.out.println("\nDepartment → Employees");

                    if (employees.isEmpty()) {
                        System.out.println("No employees registered.");
                    } else {

                        employees.forEach((department, empList) ->
                            System.out.println(department + " → " + empList)
                        );
                    }
                }

                case 4 ->
                    System.out.println("Exiting Employee Management System.");

                default ->
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}
