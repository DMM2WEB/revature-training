package com.dmm.Day03;

class Parent2 {
    //public Parent2 () {
    public Parent2 (int x) {
        //System.out.println("Parent constructor called");
        System.out.println("Parent constructor called" + " " + x);
    }
}

class Child2 extends Parent2 {
    //public Child2 () {
    public Child2 (int a) {
        super (a);
        System.out.println("Child constructor called");
    }
}

public class Demo5 {
    public static void main(String[] args) {
        Child2 c = new Child2(100);
    }
}
