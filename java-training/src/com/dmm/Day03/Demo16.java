package com.dmm.Day03;

class Bank {
    public int getRateOfInterest () {
        return 2; //a normal interest rate
    }
}

class BankA extends Bank {
    @Override
    public int getRateOfInterest () {
        return 1; //a better interest rate
    }
}

class BankB extends Bank {
    @Override
    public int getRateOfInterest () {
        return 3; //a worst interest rate
    }
}

public class Demo16 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        BankA bankA = new BankA();
        BankB bankB = new BankB();

        System.out.println("Normal interest rate: " + bank.getRateOfInterest());
        System.out.println("Better interest rate: " + bankA.getRateOfInterest());
        System.out.println("Worst interest rate: " + bankB.getRateOfInterest());
    }
}
