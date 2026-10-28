package com.balia.collection;

import java.util.*;

public class Colllection_Removing_object_from_indexes_using_RemoveMethodOfIterator {
    public static void main(String[] args) 
    {
        Integer noOfItem = Integer.valueOf(IO.readln());

        Vector<String> v = new Vector<>(noOfItem);

        for(int i =0; i<noOfItem; i++)
        {
            String name = IO.readln();
            v.add(name);
        }
        int specifidIndex = Integer.parseInt(IO.readln());
        v.remove(specifidIndex);
        IO.println("Updated shopping list:");
        v.forEach(IO::println);
        
    }
}
