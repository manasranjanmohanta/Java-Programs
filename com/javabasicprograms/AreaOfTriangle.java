package com.javabasicprograms;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base of a triangle :");
        double base = sc.nextDouble();
        System.out.println("Enter the height of the triangle :");
        double height  = sc.nextDouble();

        double result = findArea(base,height);
        System.out.println("The area of the triangle is :" + result);
    }
    static double findArea(double base, double height)
    {
       double area = 0.5 * base * height;
       return area;
    }
}
