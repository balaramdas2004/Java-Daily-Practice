package com.balia.collection;

/**
 * 
 * Remove Expired Offers
EasyCore Java • List Interface • ArrayList20 Points
Report an issue
Description
An e-commerce platform maintains a list of current promotional offers. Some offers have expired and need to be removed from the list.

Sample Data:
All Offers: ["Deal1", "Deal2", "Deal3"]
Expired Deals: ["Deal1", "Deal3"]

Task:
Write a Java program to:
Create two ArrayList<String> lists — one for all current offers and one for expired offers.
Remove all expired deals from the current offers list.
Print the list of valid offers remaining.


Expected Output:
Valid offers: [Deal2]

Hint: Use the removeAll(Collection<?> c) method from the ArrayList class.

Method Signature (Optional):
public static void removeExpiredOffers(List<String> allOffers, List<String> expiredOffers);
Examples

Example 1:

Input

Enter number of current offers: 3
Deal1
Deal2
Deal3

Enter number of expired offers: 2
Deal1
Deal3

Output

Valid offers: [Deal2]

Example 2:

Input

Enter number of current offers: 2 
DealA 
DealB 

Enter number of expired offers: 1 
DealC

Output

Valid offers: [DealA, DealB]

Explanation
The program stores all offers and expired offers in separate lists and removes expired offers from the main list using removeAll().
Constraints

    Both lists must be initialized; comparison is case-sensitive
 */

import java.util.*;

public class ArrayList_second_demo2 
{
	public static void main(String[] args) 
	{
	
	    ArrayList<String> t = new ArrayList<>();
	
	    String input = IO.readln();
	
	    if (input == null) {
	        return;
	    }
	
	    int noOfItem = Integer.parseInt(input.trim());
	    if(noOfItem<=0)
	    {
	        IO.println("Invalid offers size.");
	        return;
	    }
	    for (int i = 0; i < noOfItem; i++) {
	        String itemName = IO.readln();
	
	        if (itemName == null) {
	            return;
	        }
	
	        t.add(itemName.trim());
	    }
	
	    ArrayList<String> t1 = new ArrayList<>();
	
	    input = IO.readln();
	
	    if (input == null) {
	        return;
	    }
	
	    int noOfItemExpire = Integer.parseInt(input.trim());
	
	    for (int i = 0; i < noOfItemExpire; i++) {
	        String name = IO.readln();
	
	        if (name == null) {
	            return;
	        }
	
	        t1.add(name.trim());
	    }
	
	    t.removeAll(t1);
	
	    IO.println("Valid offers: " + t);
	}

}
