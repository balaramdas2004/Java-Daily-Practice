package com.balia.collection;


import java.util.Stack;

public class Stack_pushAndPopOperationInuserInput {
    public static void main(String[] args) 
    {
        int noOfnumber = Integer.parseInt(IO.readln().trim());
        Stack <String> t = new Stack<>();

        for(int i =0; i<noOfnumber;i++)
        {
            String tab = IO.readln();
            t.push(tab);
        }
        IO.println("Stack before pop: "+t);
        
        try
        {
            if(noOfnumber<=0)
            {
                IO.println("No tabs to close.");
            }
            else
            {

            IO.println("Closed Tab: "+t.pop());
            }
        }
        catch(Exception e)
        {

        }
        IO.println("Stack after pop: "+t);
        
    }
}
