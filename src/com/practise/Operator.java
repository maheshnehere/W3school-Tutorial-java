package com.practise;

public class Operator {
    public static void main(String[] args) {

        int x;
        int y; //declartion

        x = 10;
        y = 20; //initilization

        //operators
        int sum = x + y;
        int subtract = x - y;
        int multiply = x * y;
        int divide = x / y;
        int remainder = x % y;
        int increment = ++x;
        int decrement = --y;

        System.out.println("operator output");
        System.out.println(sum);
        System.out.println(subtract);
        System.out.println(multiply);
        System.out.println(divide);
        System.out.println(remainder);
        System.out.println(increment);
        System.out.println(decrement);

        //assignment operator
        System.out.println("assigment operator output");
        x += 2;
        System.out.println(x);
        x -= 1;
        System.out.println(x);
        x *= 2;
        System.out.println(x);
        x /= 2;
        System.out.println(x);
        x %= 2;
        System.out.println(x);
        x >>= 2;
        System.out.println(x);
        x <<= 2;
        System.out.println(x);

        //comparison operator

        int a = 1;
        int b = 2;

        if (a == b) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if (a > b) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        if (a < b) {
            System.out.println("right");
        } else {
            System.out.println("wrong");
        }

        int c = 11;
        int d = 12;

        if (c >= d) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
        if (c <= d) {
            System.out.println("confirmed");
        } else {
            System.out.println("rejected");
        }

        //else if condition

        int age = 1;

        if (age == 18) {
            System.out.println("Teenager");
        } else if (age > 18) {
            System.out.println("adult");
        } else if (age < 18) {
            System.out.println("child");
        }

        System.out.println(age > 2);

        // logical operator AND
        int u = 10;
        int s = 20;
        if (u > 9 && u < 11)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }

        System.out.println(u > 9 && u < 11); //use this technique to check condition output.

        //logical OR operator
        if (u > 9 || u < 11){

            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }

        //logical not operator

//        int u = 10;
//        int s = 20;
        if (!(u > 11 || u < 11)){

            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }




    }
}
