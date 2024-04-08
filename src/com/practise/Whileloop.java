package com.practise;

import java.util.Scanner;

public class Whileloop {
    public static void main(String[] args) {
        //The while loop loops through a block of code as long as a specified condition is true:

        int i = 0;
//       while (s<=10)
//       {
//           System.out.println("loop executed for " +s+ " time");
//           s++;
//       }
        int j = 0;
        while (i < 4) {
            System.out.print("*");
            i++;
        }
        System.out.println();
        while (j < 3) {
            System.out.print("*");
            j++;
        }
        System.out.println();
        int k = 0;
        while (k < 2) {
            System.out.print("*");
            k++;
        }
        System.out.println();
        int l = 0;
        while (l < 1) {
            System.out.print("*");
            l++;
        }
        System.out.println();
        //Write a program to calculate the sum of first 10 natural number.
        int z = 0;
        int s = 0;
        while (s < 10) {
            z += s;
            //  System.out.println("Sum of 10 natural numbers " + z);
            s++;
        }
        System.out.println(z);

        //Write a program that prompts the user to input a positive integer.
        // It should then print the multiplication table of that number.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num1 = sc.nextInt();
//        int result = 0;
        int m = 1;
        while (m <= 10) {
            int result = 0;
            result = num1*m;
            System.out.println(num1 + "*" + m + "=" + result);
            m++;

        }


    }
}
