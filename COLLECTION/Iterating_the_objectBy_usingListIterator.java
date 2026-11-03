package com.balia.collection;

import java.util.*;

public class Iterating_the_objectBy_usingListIterator {
    public static void main(String[] args) {

        ArrayList<Object> al = new ArrayList<>();

        al.add(50);
        al.add(25);

        ListIterator<Object> li = al.listIterator();

        while(li.hasNext())
            System.out.println(li.next());

        li.add(22);

        System.out.println(li.hasNext());
    }
}