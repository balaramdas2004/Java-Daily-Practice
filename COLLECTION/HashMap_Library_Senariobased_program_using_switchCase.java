package com.balia.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class HashMap_Library_Senariobased_program_using_switchCase {

    public static void main(String[] args) {

        HashMap<String, List<String>> books = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n--- Library Book Management System ---");
            System.out.println("1. Add book to category");
            System.out.println("2. Remove book from category");
            System.out.println("3. View category-wise book list");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1 -> {

                    System.out.print("Enter category name: ");
                    String category = sc.nextLine();

                    System.out.print("Enter book name: ");
                    String bookName = sc.nextLine();

                    books.computeIfAbsent(category, key -> new ArrayList<>())
                         .add(bookName);

                    System.out.println(bookName + " added to " + category);
                }

                case 2 -> {

                    System.out.print("Enter category name: ");
                    String category = sc.nextLine();

                    System.out.print("Enter book name to remove: ");
                    String bookName = sc.nextLine();

                    boolean[] removed = {false};

                    books.computeIfPresent(category, (key, bookList) -> {

                        removed[0] = bookList.remove(bookName);

                        return bookList.isEmpty() ? null : bookList;
                    });

                    if (removed[0]) {
                        System.out.println(bookName + " removed from " + category);
                    } else {
                        System.out.println("Book or category not found.");
                    }
                }

                case 3 -> {

                    System.out.println("\nCategory → Books List:");

                    if (books.isEmpty()) {
                        System.out.println("No books available.");
                    } else {

                        books.forEach((category, bookList) ->
                            System.out.println(category + " → " + bookList)
                        );
                    }
                }

                case 4 ->
                    System.out.println("Exiting Library Book Management System.");

                default ->
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}
