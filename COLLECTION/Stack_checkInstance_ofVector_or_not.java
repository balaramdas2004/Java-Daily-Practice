package com.balia.collection;

import java.util.Stack;
import java.util.Vector;


public class Stack_checkInstance_ofVector_or_not {
public static void main(String[] args) {
Stack<Integer> s = new Stack<>();
s.push(1);
s.push(2);
System.out.print(s instanceof Vector);
}
}