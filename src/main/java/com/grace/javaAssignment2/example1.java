package com.grace.javaAssignment2;
import java.util.*; 

public class example1 {
    public static void main(String[] args) 
    { 
        ArrayList<Integer> newAL = new ArrayList<Integer>();
        newAL.add(new Integer(8));
        newAL.add(new Integer(7));
        newAL.add(new Integer(6));
        newAL.add(new Integer(5));
        newAL.add(new Integer(4));
        Collections.reverse(newAL);
        System.out.print(newAL);
    } 
}
