package com.dmm.Day01;

class Test {
    static int x = 100; //static variable
    int c = 30; //instance variable

    public void addNumber(){
        //static int y = 100; not allowed
        //local variables
        int a = 10;
        int b = 20;
        System.out.println(a);
        System.out.println(b);
    }

    public void foo() {
        System.out.println(c);
    }
}

public class Demo2{
    public static void main(String[] args) {
        System.out.println("Demo2");
    }
}