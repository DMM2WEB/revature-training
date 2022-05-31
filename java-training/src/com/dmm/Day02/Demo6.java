package com.dmm.Day02;

class Book {
    public String title;
    public String author;
    public int price;

    public void printBook() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(price);
    }
}

public class Demo6 {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "Learn Java in 24 Hours";
        book1.author = "Mark Smith";
        book1.price = 100;

        //System.out.println( "Book : Title = " + book1.title + ", Author = " + book1.author + "Price = " + book1.price);

        /*System.out.println(book1.title);
        System.out.println(book1.author);
        System.out.println(book1.price);*/

        book1.printBook();

        System.out.println("*********");

        Book book2 = new Book();
        book2.title = "Master Java in 48 Hours";
        book2.author = "Honorable Mark Smith";
        book2.price = 200;

        /*System.out.println(book2.title);
        System.out.println(book2.author);
        System.out.println(book2.price);*/

        book2.printBook();
    }
}
