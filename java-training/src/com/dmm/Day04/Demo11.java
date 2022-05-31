package com.dmm.Day04;

interface X2 {
    void print ();

    interface Y2 {
        void display ();

        interface Z2 {
            void foo ();
        }
    }
}

class Output5 implements X2, X2.Y2, X2.Y2.Z2 {

    @Override
    public void print() {

    }

    @Override
    public void display() {

    }

    @Override
    public void foo() {

    }
}

public class Demo11 {
    public static void main(String[] args) {
        System.out.println("Demo11");
    }
}
