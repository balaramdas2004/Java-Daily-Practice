package com.balia.interfaceLambdafunction;
/**
 * 
 * AvailableRooms
EasyCore Java • Functional Interfaces • Predicate20 Points
Report an issue
Description
You are building a room booking system for a hotel. The system should display only available rooms — i.e., rooms that are not booked.

Your task is to write a Java program that prints the IDs of available rooms, using Predicate<Room> with .negate().

Your Task:
Create a Room class with required attributes and a constructor.

In the main method:

Create an array of Room objects.

Define a Predicate<Room> to check if a room is booked

Use .negate() to get available rooms.

Use .test() in a loop to filter and print the IDs of available rooms.

Class and Method Structure:
Class: Room

Attributes:
int id 
boolean booked 

Constructor:
Accepts id and booked to initialize the object.

Main Class: AvailableRooms
Room[] rooms = {
new Room(101, true),
new Room(102, false),
new Room(103, false)
};

Expected Output:
Available Rooms:
102
103

Hint:
- Define a predicate for booked rooms:
Predicate<Room> isBooked = r -> r.booked;

- Negate it to get available rooms:
Predicate<Room> isAvailable = isBooked.negate();

- Apply in loop:
for (Room r : rooms) {
if (isAvailable.test(r)) {
System.out.println(r.id);
}
}
Prompt the user to enter the size of array,enter the related inputs and then continue the operation.
Examples

Example 1:

Input

3 
101 
true 
102 
false 
103 
false

Output

Available Rooms: 
102 
103

Example 2:

Input

2 
201 
true 
202 
true

Output

Available Rooms:

Explanation
Uses Predicate.negate() to filter rooms that are not booked.
Constraints

    Must use Predicate.negate()
 * 
 */
import java.util.Scanner;
import java.util.function.Predicate;

class Room {
    int id;
    boolean booked;

    public Room(int id, boolean booked) {
        this.id = id;
        this.booked = booked;
    }
}

public class LamdaExpresionByUsingRecord_demo5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        Room[] rooms = new Room[size];

        // Reading room details
        for (int i = 0; i < size; i++) {
            int id = sc.nextInt();
            boolean booked = sc.nextBoolean();

            rooms[i] = new Room(id, booked);
        }

        // Predicate to check booked rooms
        Predicate<Room> isBooked = r -> r.booked;

        // Reverse the condition using negate()
        Predicate<Room> isAvailable = isBooked.negate();

        System.out.println("Available Rooms:");

        // Display available rooms
        for (Room r : rooms) {
            if (isAvailable.test(r)) {
                System.out.println(r.id);
            }
        }

        sc.close();
    }
}