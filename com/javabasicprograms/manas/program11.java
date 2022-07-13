package com.javabasicprograms.manas;

import java.util.Scanner;

public class program11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number upto you want to find the fibonacci series:");
        int n = sc.nextInt();
        int fib1 = 0;
        int fib2 = 1;
        int sum = 0;
        for (int i = 2;i < n;i++){
            int fib = fib1 + fib2;
            if (fib % 2 == 0)
                sum = sum + fib;
            fib1 = fib2;
            fib2 =fib;
        }
        System.out.println("The even sum of fibonacci series upto " + n + " is : "+ sum);
    }
}
