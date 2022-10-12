package com.grace;

public class WashingMachine {

    public void switchOn(){
        System.out.println("Washing machine is on");
    }

    public void acceptClothes(int numOfClothes){
        System.out.println(numOfClothes + " clothes are being washed");
    }
    public void acceptDetergent(){
        System.out.println("Washing machine is ready to be ran!");
    }

    public void switchOff(){
        System.out.println("Washing machine is off");
    }

    public static void main( String[] args ){
        WashingMachine whirlpool = new WashingMachine();
        whirlpool.acceptClothes(6);
    }
}
