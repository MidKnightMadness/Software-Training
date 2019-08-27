package org.tka.robotics.lessons;

public class Methods {

    public static void main(String[] args) {
        myMethod();
        favoriteNumber(17);
        int lowNumber = 2;
        int highNumber = makeNumberHigh(lowNumber);
        System.out.print("I started with " + lowNumber + " and now I have " + highNumber + "!");
    }

    private static void myMethod() {
        System.out.println("I can print from a method!");
    }

    private static void favoriteNumber(int num) {
        System.out.println("My favorite number is: " + num);
    }

    private static int makeNumberHigh(int num) {
        return num * 78;
    }
}


/*
# Notes:

Refactor
   - right-click on the class in the tree view and use refactor to change the name of the class
   - changes the name of the class, the file, and any references to the class in other files
   OR
   - right-click on a variable to change it and any other references to it

Style Guide
   - Classes - each word starts with a capital letter, ExampleClass
   - properties, variables, and methods - camelCase - each word starts with a capital letter except the first, exampleVariable
   - static properties - all caps with underscores for spaces, EXAMPLE_CONSTANT

 */