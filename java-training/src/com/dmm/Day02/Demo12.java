package com.dmm.Day02;

class Person {
    public String fistName;
    public String lastName;
    public int age;
    public String country;
    public String email;
    public String phone;

    public void getFullName () {
        System.out.println("My name is " + fistName + " " + lastName);
    }

    public void getAge () {
        System.out.println("I am " + age + " years old");
    }

    public void getCountry () {
        System.out.println("I am from " + country);
    }

    public void getContactInfo () {
        System.out.println("You can contact me on " + phone + " and " + email);
    }
}

public class Demo12 {
    public static void main(String[] args) {
        Person person = new Person();
        person.fistName = "Mark";
        person.lastName = "Watson";
        person.age = 30;
        person.country = "USA";
        person.phone = "9999999";
        person.email = "my@gmail.com";

        person.getFullName();
        person.getAge();
        person.getCountry();
        person.getContactInfo();
    }
}
