package com.balia.collection;

import java.util.*;

public class ArrayList_Adding_Item_tothe_CArd {
    public static void main(String[] args) 
    {
        int noOfItem = Integer.parseInt(IO.readln().trim());

        ArrayList<String> a = new ArrayList<>();

        for(int i=0; i<noOfItem;i++)
        {
            String itemName= IO.readln();
            a.add(itemName);
        }
        
        String addItem = IO.readln();
        a.add(addItem);
        IO.println("Updated cart: "+a);
        
    }
}
