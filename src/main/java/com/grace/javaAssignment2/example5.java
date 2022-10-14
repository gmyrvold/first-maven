package com.grace.javaAssignment2;
import java.util.*; 

public class example5 {
    public static void main(String[] args) 
    { 
        HashSet<Integer> newHS = new HashSet<Integer>();
        newHS.add(new Integer(8));
        newHS.add(new Integer(7));
        newHS.add(new Integer(6));
        newHS.add(new Integer(5));
        newHS.add(new Integer(4));
    
        Integer arr[] = new Integer[newHS.size()];
        newHS.toArray(arr);

        System.out.print(Arrays.toString(arr));
    } 
}
