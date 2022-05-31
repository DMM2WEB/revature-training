package com.dmm.Day03;

class Car3 {
    public final int speedLimit = 60;

    public void drive () {
        //speedLimit = 100, final keyword does not allow change
        System.out.println("Car is driving at max speed limit of " + speedLimit);
    }
}

public class Demo17 {
    public static void main(String[] args) {
        Car3 car3 = new Car3();
        car3.drive();
    }
}
