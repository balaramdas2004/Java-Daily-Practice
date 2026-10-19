/*
 * Program 03:
-----------
Format :
---------
PlayerDemo.java (File name)
----------------------------
//ELC
public class PlayerDemo
{
   void main()
    {
    }
}

//BLC
class Player
{
   //Properties
        +
   //Behaviour 
}

Write a Program on OOPs to define Player class properties and behaviour.

properties/Field/Attribute :

String playerName;
int noOfMatches;
int totalRuns;

Initialize these properties with the help of method using parameter variable.

behavior/Method:
setPlayerData(String name, int matches, int runs) : public void
getPlayerData() : public void

 */

//ELC
package com.balia.Opp2;

public class PlayerDemo 
{
	public static void main()
	{
		Player p1 = new Player();
		//
		String name = IO.readln("Enter the name of the player:");
		int match = Integer.parseInt(IO.readln("Enter the total number of mathes the player play:"));
		int runs = Integer.parseInt(IO.readln("Enter the total run that player do:"));
		
		p1.setPlayerData(name, match, runs);
		p1.getPlayersDetails();
	}
}

//BLC

class Player
{
	String playerName;
	int noOfMatch;
	int totalRuns;
	
	public void setPlayerData(String name, int matches, int runs)
	{
		playerName = name;
		noOfMatch = matches;
		totalRuns = runs;
	}
	
	public void getPlayersDetails()
	{
		IO.println("Player name is :"+playerName);
		IO.println("Total matchs played is :"+ noOfMatch);
		IO.println("Total runs: "+totalRuns);
	}
		
}
