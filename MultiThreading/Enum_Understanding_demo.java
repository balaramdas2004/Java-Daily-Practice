package com.balia.MultiThreading;

enum Direction 
{
    NORTH, SOUTH, EAST, WEST 
}

class Enum_Understanding_demo 
{
    public static void main(String[] args) 
    {
        Direction d = Direction.NORTH;
        Direction d1 = Direction.SOUTH;

        System.out.println(d);
        IO.println(d1);
    }
}