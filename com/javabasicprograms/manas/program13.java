package com.javabasicprograms.manas;
/* Java program to find out the perimeter of  a rectangle */
import java.util.Scanner;

public class program13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle :");
        int a = sc.nextInt();
        System.out.println("Enter the width of the rectangle :");
        int b = sc.nextInt();

        int perimeter = 2 * (a + b);

        System.out.println("The perimeter of the rectangle is : " + perimeter);
    }
    
}
