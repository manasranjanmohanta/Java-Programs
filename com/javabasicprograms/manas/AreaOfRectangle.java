package com.javabasicprograms.manas;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter the breadth of the rectangle : ");
        double breadth = sc.nextDouble();
        System.out.println("Enter the width of the rectangle : ");
        double width = sc.nextDouble();

        double result = findArea(breadth,width);
        System.out.println("The area of the rectangle is : " + result);
    }
    static double findArea(double breadth, double width){
        double area = breadth * width;
        return area;
    }
}
