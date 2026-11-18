package com.balia.collection;

import java.util.HashMap;

public class HashMap_PutMethod_demo3 {
    public static void main(String[] args) {
        // 1. Create a HashMap (Key: String, Value: Integer)
        HashMap<String, Integer> ages = new HashMap<>();

        // 2. Add key-value pairs using put()
        ages.put("Rahul", 25);
        ages.put("Priya", 28);
        ages.put("Amit", 22);

        // 3. Print the entire HashMap
        System.out.println("HashMap: " + ages);

        // 4. Get a single value using its key
        System.out.println("Priya's age: " + ages.get("Priya"));
    }
}
