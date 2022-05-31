package com.dmm.Day03;

class Bike {
    public final void drive () {
        System.out.println("Driving ... ");
    }
}

class Honda extends Bike {
    /*@Override
    public void drive () {
        System.out.println("Not driving ... ");
    }*/
}

public class Demo18 {
    public static void main(String[] args) {
        Honda honda = new Honda();
        honda.drive();
    }
}
