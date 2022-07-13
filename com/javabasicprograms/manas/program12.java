package com.javabasicprograms.manas;
/* Java program to calculate simple interest */
import java.util.Scanner;

public class program12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the principal amount:");
        float P = sc.nextFloat();
        System.out.println("Enter the rate of interest:");
        float r = sc.nextFloat();
        System.out.println("Enter the time period:");
        int T = sc.nextInt();

        float R = r / 100;
        float SI =  (P * R * T) / 100;

        System.out.println("The simple interest is : " + SI);
    }
}
