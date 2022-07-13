package com.learningjavaprograms;
import java.util.*;
public class Circle {
    static final double PI = 3.14;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of a circle :");
        double radius = sc.nextDouble();
        double c = findCircumference(radius);
        double a = findArea(radius);
        System.out.printf("Circumference = %.2f\n",c);
        System.out.println("Area = " + a);
    }
    static double findCircumference(double radius){
        double x = 2 * PI * radius;
        return x;
    }
    static double findArea(double radius){
        double y = PI * Math.pow(radius,2);
        return y;
    }
}
