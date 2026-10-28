package com.balia.collection;

import java.util.Vector;

public class Collection_addElemet_Retrive_element_by_userInput {
    public static void main(String[] args) 
    {
        Integer numOfStudent = Integer.valueOf(IO.readln());

        Vector<String> v = new Vector<>(numOfStudent);

        for(int i=0; i<numOfStudent;i++)
        {
            String name = IO.readln();
            v.add(name);
        }
        IO.println("Students in Vector:");
        v.forEach(IO::println);
    }
}
