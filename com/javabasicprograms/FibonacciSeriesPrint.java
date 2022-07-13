package com.javabasicprograms;

import java.util.Scanner;

public class FibonacciSeriesPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a how many term you want to print:");
        int num = sc.nextInt();
        int fib1 = 0;
        int fib2 = 1;
        int fib = 0;
        System.out.print("The fibonacci series is : " + fib1 +" "+ fib2);
        for (int i = 0; i < (num - 2); i++) {
            fib = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib;
            System.out.print(" " + fib);

        }
    }
}