package com.dmm.Day04;

class Customer {
    protected String firstName;
    protected String lastName;

    public void getFullName () {
        System.out.println(firstName + " " + lastName);
    }
}

class ChildTest extends Customer {

}

public class Demo12 {
    public static void main(String[] args) {
        ChildTest obj = new ChildTest();
        obj.firstName = "Mark";
        obj.lastName = "Smith";
        obj.getFullName();

    }
}
