package com.grace;

public class Bank { 
    public void deposit(double amount, double balance){
        double newBalance = amount + balance;
        System.out.println("Your new balance is $" + newBalance);
    }
    public void withdraw(double amount, double balance){
        double newBalance = balance - amount;
        if (newBalance == 0){
            System.out.println("We're sorry, it appears you are broke.");
        }
        System.out.println("Your new balance is $" + newBalance);
    }
    public static void main( String[] args ){
        Bank customer = new Bank();
        customer.deposit(0, 50);
        customer.withdraw(20, 50);
    }
}
