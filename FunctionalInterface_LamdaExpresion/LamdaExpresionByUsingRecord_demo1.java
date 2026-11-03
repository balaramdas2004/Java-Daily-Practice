package com.balia.interfaceLambdafunction;
/**
 * 
 * CarSellingPredicate
easyCore Java • Functional Interfaces • Predicate20 Points
Report an issue
Description
Develop a scenario-based Java program using the Predicate functional interface to determine whether a car is eligible for sale or not.

Create a record named Car with the following record components:

brand – String
price – Double
mileage – Integer

Java will automatically provide the canonical constructor for initializing these record components.

Create an ELC class named CarSelling containing the main() method. Read the car details from the user using an IO class / Scanner, and create a Car record object.

In the CarSelling ELC class, create a Predicate<Car> to verify whether the car is eligible for sale based on the following criteria:

The car price must be less than or equal to ₹5,00,000.
The car mileage must be greater than or equal to 20 km/l.

The car is considered eligible for sale only when both conditions are satisfied.

Finally, display the appropriate message based on the result.
Examples

Example 1:

Input

Enter the brand name of the Car :Naxon
Enter the price of the Car :450000
Enter the mileage of the Car :22

Output

Naxon is eligible for sale

Example 2:

Input

Enter the brand name of the Car :BE6
Enter the price of the Car :1800000
Enter the mileage of the Car :25

Output

BE6 is not eligible for sale


 */
import java.util.Scanner;
import java.util.function.Predicate;

// Record declaration
record Car(String brand, Double price, Integer mileage) {
}

public class LamdaExpresionByUsingRecord_demo1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read car details
        String brand = sc.nextLine();
        Double price = sc.nextDouble();
        Integer mileage = sc.nextInt();

        // Create Car record object
        Car car = new Car(brand, price, mileage);

        // Create Predicate
        Predicate<Car> p = c ->
                c.price() <= 500000 && c.mileage() >= 20;

        // Check eligibility
        if (p.test(car)) {
            System.out.println(car.brand() + " is eligible for sale");
        } else {
            System.out.println(car.brand() + " is not eligible for sale");
        }

        sc.close();
    }
}