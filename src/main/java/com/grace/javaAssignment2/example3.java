package com.grace.javaAssignment2;
import java.util.*; 

public class example3 {
    public static void main(String[] args) 
    { 
        LinkedList<Integer> newLL = new LinkedList<Integer>();
        newLL.add(new Integer(8));
        newLL.add(new Integer(7));
        newLL.add(new Integer(6));
        newLL.add(new Integer(5));
        newLL.add(new Integer(4));
    
        ListIterator<Integer> iterate = newLL.listIterator(2);
        while(iterate.hasNext()){
            System.out.print(iterate.next());
        }
    } 
}
