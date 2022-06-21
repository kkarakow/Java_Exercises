package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        double a;
//        double v1;
//        double v0;
//        double t;
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter starting velocity v0 in meters/second: ");
//        v0 = input.nextDouble();
//
//        System.out.println("Enter ending velocity v1 in meters/second: ");
//        v1 = input.nextDouble();
//
//        System.out.println("Enter the time span in seconds: ");
//        t = input.nextDouble();
//
//        a = (v1 - v0) / t;
//        System.out.println("The average acceleration (a) is: " + a);

        double feet;
        double meters;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value for feet: ");
        feet = input.nextDouble();

        meters = feet * 0.3048;

        System.out.println(feet + " feet is " + meters + " meters");


    }
}
