package com.practise;

public class Ifelsecondition {
    public static void main(String[] args) {
        //Use if to specify a block of code to be executed, if a specified condition is true
        //Use else to specify a block of code to be executed, if the same condition is false
        //Use else if to specify a new condition to test, if the first condition is false
        //Use switch to specify many alternative blocks of code to be executed

        int a = 20;
        int b = 30;
        int c = 40;

        //if - elseif

        /*if (condition1) {
  // block of code to be executed if condition1 is true
} else if (condition2) {
  // block of code to be executed if the condition1 is false and condition2 is true
} else {
  // block of code to be executed if the condition1 is false and condition2 is false
}

         */

        if (a > b) {
            System.out.println("A is greater than B ");
        } else if (b > c) {
            System.out.println("B is greater than C");
        } else {
            System.out.println("C is greater than A & B");
        }

        //if-else
        if (a > b) {
            System.out.println("A is greater than B ");
        } else {
            System.out.println("C is greater than A & B");
        }

        //shorthand ifelse

        //variable = (condition) ? expressionTrue :  expressionFalse;
        int age = 20;
        String vote;
        vote = (age > 18)?"Can vote":"Cannot vote";
        System.out.println(vote);

    }
}
