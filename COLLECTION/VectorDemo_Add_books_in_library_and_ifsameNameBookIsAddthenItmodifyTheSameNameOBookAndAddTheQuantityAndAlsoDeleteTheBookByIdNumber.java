package com.balia.collection;

import java.util.*;

record Books(int bookId , String bookTitle , String authorName ,int quantity )
{
    @Override 
    public String toString() 
    { 
        return bookId + " " + bookTitle + " " + authorName + " " + quantity; 
    }

}

public class VectorDemo_Add_books_in_library_and_ifsameNameBookIsAddthenItmodifyTheSameNameOBookAndAddTheQuantityAndAlsoDeleteTheBookByIdNumber {
    public static void main(String[] args) 
    {
        int noOfBooks = Integer.parseInt(IO.readln("Enter number of book u want to store:"));
        Vector<Books> v = new Vector<>();

        for(int i =0; i< noOfBooks; i++)
        {
            int bookId = Integer.parseInt(IO.readln("Enter the bookId:").trim());
            String bookTitle = IO.readln("Enter the bookTitle:").trim();
            String authorName = IO.readln("Enter the authorName:").trim();
            int quantity = Integer.parseInt(IO.readln("Enter the quantity:").trim());

            boolean found = false;

            for(int j =0; j < v.size(); j++)
            {
                Books b = v.get(j);

                if(b.bookTitle().equalsIgnoreCase(bookTitle))
                {
                    v.set(j,new Books(b.bookId(), b.bookTitle(), b.authorName(), b.quantity()+ quantity));
                    found = true;
                    break;
                }
            }

            if(found)
            {
                IO.println("Duplicate book found, quantity updated");
            }
            else
            {	
            	IO.println("No duplicate book is present");
                v.add(new Books(bookId,bookTitle, authorName, quantity));
            }
        }

        int removeId = Integer.parseInt(IO.readln("Enter the id u want to remove:"));

        boolean removed = false;

        for(int i=0; i<v.size(); i++)
        {
            if(v.get(i).bookId() == removeId)
            {
                v.remove(i);
                removed = true;
                break;
            }
        }
        if(removed)
        {
            IO.println("Book removed");
        }
        else
        {
            IO.println("Book not found");
        }
        
        IO.println("Remaining Books:");
        
        int total =0;
        for(Books b : v)
        {
            IO.println(b);
            total += b.quantity();
            
        }
        IO.println("Total Quantity: "+total);
    }
}
