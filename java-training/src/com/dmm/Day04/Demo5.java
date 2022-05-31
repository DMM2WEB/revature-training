package com.dmm.Day04;

interface WorldBank {
    void deposit ();
    void withdraw ();
}

class NationalBank implements WorldBank {

    @Override
    public void deposit () {

    }

    @Override
    public void withdraw () {

    }
}

public class Demo5 {
    public static void main(String[] args) {
        System.out.println("Demo5");
    }
}
