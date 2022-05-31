package com.dmm.Day04;

interface I1 {
    void print ();
}

interface I2 extends I1 {
    void display ();
}

class Output3 implements I2 {

    @Override
    public void print () {

    }
    @Override
    public void display () {

    }
}

/*class Output4 implements I1 , I2 {

    @Override
    public void print () {

    }

    @Override
    public void display () {

    }
}*/

public class Demo7 {
    public static void main(String[] args) {
        System.out.println("Demo7");
    }
}
