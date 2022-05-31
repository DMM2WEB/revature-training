package com.dmm.Day02;

class Test {
    public Test () {
        System.out.println("1st Constructor");
    }

    public Test (int a) {
        System.out.println("2nd Constructor");
    }

    public Test (String a) {
        System.out.println("3rd Constructor");
    }

    public Test (int a, String b) {
        System.out.println("4th Constructor");
    }

    public Test (String a, int b) {
        System.out.println("5th Constructor");
    }
}

public class Demo10 {
    public static void main(String[] args) {
        Test test1 = new Test(); //1st
        Test test2 = new Test("A"); //3rd
        Test test3 = new Test("A", 10); //5th
        Test test4 = new Test(10); //2nd
        Test test5 = new Test(10, "A"); //4th
    }
}
