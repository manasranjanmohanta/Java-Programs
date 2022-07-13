package com.javabasicprograms.manas;

import java.util.Scanner;

import static java.lang.Math.pow;

public class AreaOfCircle {
    final static double PI = 3.14;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of the circle : ");
        double radius = sc.nextDouble();

        double result = findArea(radius);
        System.out.println("The area of the Circle is : " + result);
    }
    static double findArea(double radius){
        double area = PI * pow(radius,2);
        return area;
    }
}
