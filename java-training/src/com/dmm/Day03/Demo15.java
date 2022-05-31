package com.dmm.Day03;

class Parent3 {
    public void greeting (String name) {
        System.out.println("Hello " + name);
    }
}

class Child3 extends Parent3 {
    @Override
    public void greeting (String name) {
        System.out.println("Welcome " + name);
    }
}

public class Demo15 {
    public static void main(String[] args) {
        Child3 c = new Child3();
        c.greeting("Mark");
    }
}
