package com.dmm.Day03;

class Car2 {
    public String name;
    public String brand;
    public String color;
    public String engineType;
    public int price;

    public Car2 (String name, String brand, String color, String engineType, int price) {
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.engineType = engineType;
        this.price = price;
    }

    public Car2 (Car2 carObj) {
        this.name = carObj.name;
        this.brand = carObj.brand;
        this.color = carObj.color;
        this.engineType = carObj.engineType;
        this.price = carObj.price;
    }

    public Car2 (Car2 carObj, int price) {
        this.name = carObj.name;
        this.brand = carObj.brand;
        this.color = carObj.color;
        this.engineType = carObj.engineType;
        this.price = price;
    }

    public void getCar2 () {
        System.out.println();
    }
}

public class Demo2 {
    public static void main(String[] args) {
        Car2 car1 = new Car2 ("A6", "Audi", "Black", "Petrol", 100000);
        Car2 car2 = new Car2 (car1);
        Car2 car3 = new Car2 (car2, 300000);

        System.out.println(car1.price);
        System.out.println(car2.price);
        System.out.println(car3.price);
    }
}
