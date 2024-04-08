package com.practise;

import java.lang.Math;
import java.util.Random;

public class Maths {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int e = -23;


        int z = Math.max(x, y);
        System.out.println(z);

        int a = Math.min(x, y);
        System.out.println(a);

        int b = (int) Math.sqrt(x);
        System.out.println(b);

        y = (int) Math.sqrt(y);
        System.out.println(y);


        System.out.println(Math.max(x, y));
        System.out.println(Math.min(x, y));
        System.out.println(Math.sqrt(y));
        System.out.println(Math.abs(e));

        //random numbers

        int num = (int) (Math.random() * 101);
        System.out.println(num);

        System.out.println((int) (Math.random() * 10));


    }
}
