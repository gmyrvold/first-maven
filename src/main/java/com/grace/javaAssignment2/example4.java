package com.grace.javaAssignment2;
import java.util.*; 

public class example4 {
    public static void main(String[] args) 
    { 
        LinkedList<Integer> newLL = new LinkedList<Integer>();
        newLL.add(new Integer(8));
        newLL.add(new Integer(7));
        newLL.add(new Integer(6));
        newLL.add(new Integer(5));
        newLL.add(new Integer(4));
    
        newLL.set(0, 3);
        System.out.print(newLL);
    } 
}
