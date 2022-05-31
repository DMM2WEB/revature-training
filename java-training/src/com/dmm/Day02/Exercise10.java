package com.dmm.Day02;

//to create class and objects, like Dog, Student, Employee etc

class Dog {

    public void name () {
        System.out.println("Doog");
    }
    public void color () {
        System.out.println("Grey");
    }

    public void sleep () {
        System.out.println("Sleeping...");
    }

    public void play () {
        System.out.println("Playing...");
    }
}

public class Exercise10 {
    public static void main(String[] args) {
        Dog dogObj = new Dog();
        dogObj.name();
        dogObj.color();
        dogObj.sleep();
        dogObj.play();
    }
}
