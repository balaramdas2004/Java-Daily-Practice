package com.balia.collection;

import java.util.Stack;

public class Stack_using_pushandRemove {
public static void main(String[] args) {
Stack<Integer> s = new Stack<>();
s.push(1);
s.push(2);
s.remove(1);
System.out.print(s);
}
}