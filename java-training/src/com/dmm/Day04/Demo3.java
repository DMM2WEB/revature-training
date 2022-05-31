package com.dmm.Day04;

abstract class Test1 {
    public abstract void display1 ();
}

abstract class Test2 extends Test1 {
    public abstract void display2 ();
}

abstract class Test3 extends Test2 {
    public abstract void display3 ();
}

class Output2 extends Test3 {

    @Override
    public void display1 () {

    }

    @Override
    public void display2 () {

    }

    @Override
    public void display3 () {

    }
}

public class Demo3 {
    public static void main(String[] args) {
        System.out.println("Demo3");
    }
}
