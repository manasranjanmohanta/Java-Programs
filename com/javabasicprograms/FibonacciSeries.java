package com.javabasicprograms;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to which you want to know their fibonacci series: ");
        int num = sc.nextInt();
        int fib1 = 0;
        int fib2 = 1;
        int fib = 0;
        for (int i = 0; i < num; i++) {
            fib=fib1+fib2;
            fib1 = fib2;
            fib2 = fib;

        }
        System.out.println("The fibonacci value is :"+fib);


    }
}