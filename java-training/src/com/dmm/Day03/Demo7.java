package com.dmm.Day03;

class Student {
    public int rollNumber;
    public String name;
    public String schoolName = "ABC School";
}

public class Demo7 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.rollNumber = 1;
        student1.name = "Mark";
        System.out.println(student1.rollNumber);
        System.out.println(student1.name);
        System.out.println(student1.schoolName);

        Student student2 = new Student();
        student2.rollNumber = 2;
        student2.name = "Paul";
        System.out.println(student2.rollNumber);
        System.out.println(student2.name);
        System.out.println(student2.schoolName);
    }
}
