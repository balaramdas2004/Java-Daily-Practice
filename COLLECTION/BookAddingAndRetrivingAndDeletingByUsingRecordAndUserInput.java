package com.balia.collection;

import java.util.Vector;

record Book (int bookId , String bookTitle, String authorName)
{
    public String toString()
    {
        return bookId+" "+bookTitle+" "+authorName;
    }
}

public class BookAddingAndRetrivingAndDeletingByUsingRecordAndUserInput {
    public static void main(String[] args) 
    {
        Integer noOfBook = Integer.valueOf(IO.readln());

        if(noOfBook<=0)
        {
            IO.println("Number of books must be greater than 0");
            return;
        }
        Vector <Book> v = new Vector<Book>(noOfBook);

        for(int i =0; i<noOfBook; i++)
        {
            int bookId = Integer.parseInt(IO.readln());
            String bookTitle = IO.readln();
            String authorName = IO.readln();
            
            Book b = new Book(bookId, bookTitle, authorName);
            v.add(b);

        }
        IO.println("Total Books: "+v.size());

        String searchTitle = IO.readln();

        boolean isFound = false;

        for(int i =0; i<noOfBook;i++)
        {
            if(v.get(i).bookTitle().equalsIgnoreCase(searchTitle))
            {
                v.remove(i);
                isFound = true;
                break;
            }
        }
        
        if(isFound)
        {
            IO.println("Book found and removed");
        }
        else
        {
            IO.println("Book not found");
        }
        IO.println("Remaining Books:");

        v.forEach(IO::println);

    }
}
