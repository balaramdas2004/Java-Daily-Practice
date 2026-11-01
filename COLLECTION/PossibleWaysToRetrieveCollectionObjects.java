package com.balia.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class PossibleWaysToRetrieveCollectionObjects
{
   public static void main(String[] args)
   {
      Vector<String> listOfCity = new Vector<>();
      listOfCity.add("Hyderabad");
      listOfCity.add("Vizag");
      listOfCity.add("Pune");
      listOfCity.add("Mumbai");
     
      IO.println("1) By using toString() Method :");
      IO.println(listOfCity.toString());

      IO.println("2) By using Ordinary for loop :");
     
      for(int i=0; i<listOfCity.size(); i++)
      {
          IO.println(listOfCity.get(i));
      }
     
      IO.println("3) By using for each loop :");
     
      for(String city : listOfCity)
      {
          IO.println(city);
         
      }
     
      IO.println("4) By using Enumeration<E> interface :");      
      Enumeration<String> ele = listOfCity.elements();
     
      while(ele.hasMoreElements())
      {
          IO.println(ele.nextElement());
      }
     
     
      IO.println("5) By using Iterator<E> interface :");
     
      Iterator<String> itr = listOfCity.iterator();  
     
      while(itr.hasNext())
      {
          IO.println(itr.next());
      }
     
      IO.println("6) By using ListIterator<E> interface :");
      ListIterator<String> lstItr = listOfCity.listIterator();
     
      IO.println("IN FORWARD DIRECTION :");      
      while(lstItr.hasNext())
      {
          IO.println(lstItr.next());
      }
     
      IO.println("IN BACKWARD DIRECTION :");      
      while(lstItr.hasPrevious())
      {
          IO.println(lstItr.previous());
      }  
     
     
   }
}