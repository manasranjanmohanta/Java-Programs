package com.javabasicprograms;

import java.util.Scanner;

public class MultiplicationOfANum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int multi = n * i;
            System.out.printf("%d*%d="+multi, n, i);
            System.out.println("\n");
        }
    }
}
