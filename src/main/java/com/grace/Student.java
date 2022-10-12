package com.grace;

public class Student {
    public void average(int exam1, int exam2, int exam3){
        int total = exam1 + exam2 + exam3;
        int avg = total / 3;
        if (avg > 50){
            System.out.println("Student has passed");
        }else{
            System.out.println("Student has failed");
        }
    }

    public void input(String name){
        System.out.println("Hello " + name);
    }
    public static void main( String[] args ){
        Student student1 = new Student();
        student1.input("james");
        student1.average(70, 34, 23);
    }
}
