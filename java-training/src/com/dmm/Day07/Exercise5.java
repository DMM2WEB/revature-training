package com.dmm.Day07;

//program to create custom exception

import java.util.ArrayList;
import java.util.Arrays;

class CustomException extends Exception {
    public CustomException (String message) {
        super(message);
    }
}

class Principal {
    ArrayList <String> languages = new ArrayList<>(Arrays.asList("Java", "Python", "C++"));

    public void checkLanguage (String language) throws CustomException {
        if (languages.contains(language)) {
            throw new CustomException(language + " already exists");
        }
        else {
            languages.add(language);
            System.out.println(language + " is added to the ArrayList");
        }
    }
}

public class Exercise5 {
    public static void main(String[] args) {
        Principal obj = new Principal();

        try {
            obj.checkLanguage("Swift");
            obj.checkLanguage("Java");
        }
        catch (CustomException e) {
            System.out.println("[" + e + "] Exception occurred");
        }
    }
}/* https://www.programiz.com/java-programming/examples/create-custom-exception */
