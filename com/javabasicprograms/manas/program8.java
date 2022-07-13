package com.javabasicprograms.manas;

import java.util.Scanner;

public class program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int y = n * n;
        int sum = 0,digit;

        while (y != 0){
            digit = y % 10;
            sum = sum + digit;
            y = y / 10;
        }
        if (sum == n)
            System.out.println("It is a neon number.");
        else
            System.out.println("It is not a neon number.");
    }
}
