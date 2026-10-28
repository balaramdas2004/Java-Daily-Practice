package com.balia.collection;

import java.util.Vector;
public class Collection_checking_the_capacity_of_Vector {
    public static void main(String[] args) {

        Vector<Integer> v = new Vector<>(2);

        v.add(10);
        v.add(20);
        v.add(30);
        v.add(50);
        v.add(60);
        System.out.println("how many element can store in the vector:"+v.capacity());
        IO.println("element oocupied in the vector :"+v.size());
        v.forEach(IO::println);
    }
}