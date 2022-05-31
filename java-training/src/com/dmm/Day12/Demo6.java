package com.dmm.Day12;

class MyClass <T> {
    T obj;

    void add (T obj) {
        this.obj = obj;
    }

    T get () {
        return obj;
    }
}

public class Demo6 {
    public static void main(String[] args) {
        MyClass<String> myClass = new MyClass<>();
        myClass.obj = "Hello";
        myClass.add("World");
        String a = myClass.get();
        System.out.println(a);

        MyClass<Integer> myClass2 = new MyClass<>();
        myClass2.obj = 100;
        myClass2.add(200);
        Integer i = myClass2.get();
        System.out.println(i);
    }
}
