package org.tka.robotics.lessons;



public class Control {

    public static void main(String[] args) {

        Boolean imSmart = true;

        //if statements are pretty self-explanatory
        //if the statement in the parentheses is true, then the code inside the brackets will run
        if(imSmart) {
            System.out.println("I'm super smart!");
        }



        /*
        Here are all the comparison operators:

        >     greater than
        <     less than
        >=    greater than or equal to
        <=    less than or equal to
        ==    equal to

        */

        int num1 = 4;
        int num2 = 5;

        if(num1 + num2 < 10) {
            System.out.println("We got some small numbers!");
        }

        if(num1 == num2) {
            System.out.println("Uh oh, the numbers are the same!!!!!");
        }
    }
}
