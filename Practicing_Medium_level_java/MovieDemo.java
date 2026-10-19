/*
 * Program 03:
-----------
Format :
---------
MovieDemo.java (File name)
----------------------------
//ELC
public class MovieDemo
{
   void main()
    {
    }
}

//BLC
class Movie
{
   //Properties
        +
   //Behavior
}

Write a Program on OOPs to define Movie class properties and behaviour.

properties/Field/Attribute :

String movieName;
String heroName;
double userRating;

Initialize these properties with the help of method using parameter variable.

behavior/Method:
setMovieData(String name, String hero, double rating) : public void
getMovieData() : public String [return type is String]


Create 2 more programs with your thinking and imagination.


 */

package com.balia.Opp2;;

public class MovieDemo 
{
	public static void main()
	{
		Movie ex = new Movie();
		String movieName = IO.readln("Enter the Name of the Movie: ");
		String hero = IO.readln("Enter the Hero name: ");
		double rating = Double.parseDouble(IO.readln("Give us a rating: "));
		ex.setMovieData(movieName, hero, rating);
		String value = ex.getMovieDetails();
		IO.println(value);
		
	}
	
}
//BLC
class Movie
{
	String movieName;
	String heroName;
	double userRating;
	
	public void setMovieData(String name, String hero, double rating)
	{
		movieName = name;
		heroName = hero;
		userRating = rating;
		
	}
	
	public String getMovieDetails()
	{
		return "[ The Movie name is :"+ movieName+ ", hero name is : "+heroName+ ", user rating for this Movies: "+ userRating +" ]";
	}
	
}


