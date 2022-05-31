package com.dmm.Day12;

import java.rmi.StubNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

class Student implements Comparable <Student> {
    int rollnumber;
    String name;
    int age;

    public Student (int rollnumber, String name, int age) {
        this.rollnumber = rollnumber;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString () {
        return "Student{" + "rollnumber:" + rollnumber + ", name:" + name + ", age:" + age + "}";
    }

    @Override
    public int compareTo (Student other) {
        if (rollnumber > other.rollnumber)
            return 1;
        else if (rollnumber < other.rollnumber)
            return -1;
        else
            return 0;
    }
}

public class Demo4 {
    public static void main(String[] args) {
        ArrayList <Student> students = new ArrayList<>();
        students.add(new Student (2, "Paul", 30));
        students.add(new Student(3, "Watson", 40));
        students.add(new Student(1, "Mark", 20));

        System.out.println("Before sorting...");
        for (Student student : students) {
            System.out.println(student);
        }

        //Collections.sort(students, new SortByName ());
        Collections.sort(students);
        //Collections.reverse(students);
        System.out.println("After sorting...");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
