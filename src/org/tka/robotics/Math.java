package org.tka.robotics;

public class Math {

    public static void main(String[] args) {

        int someInteger = 1;
	    double someDouble = someInteger / 4;
	    double anotherDouble = (double) someInteger / 4;

	    System.out.println("The integer is " + someInteger +
                ", the double is " + someDouble +
                ", and the other double is " + anotherDouble + "."
        );

	    double lotsOfMath = (1 / 4.) + 2.3 - ((593102109 * 3.123E5) % 23);

	    System.out.printf("Lots of math is: %d as an integer, %f as a double, and %.1f %s",
                (int) lotsOfMath,
                lotsOfMath,
                lotsOfMath,
                "as a double with one decimal place."
        );
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