package com.dmm.Day03;

class Parent {
    public Parent () {
        System.out.println("Parent Constructor");
    }

    public void parentMethod () {

    }
}

class Child extends Parent {
    public Child () {
        System.out.println("Child constructor");
    }

    public void childMethod () {

    }
}

public class Demo4 {
    public static void main(String[] args) {
        // Parent p = new Parent();
        Child c = new Child();
        c.parentMethod();
        c.childMethod();

        Parent p = new Parent();
        p.parentMethod();
    }
}
