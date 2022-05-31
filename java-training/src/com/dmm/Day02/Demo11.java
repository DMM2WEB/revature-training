package com.dmm.Day02;

class Car {
    private String brand;
    private String modelName;
    private String manufacturingYear;
    private String color;
    private int price;

    public void drive () {
        System.out.println("Driving...");
    }

    public void stop() {
        System.out.println("Stopping...");
    }
}

public class Demo11 {
    public static void main(String[] args) {
        Car carObj = new Car();
        carObj.drive();
        carObj.stop();
    }
}
