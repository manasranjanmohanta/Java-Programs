package com.javapatternprograms;

/* Java program to print right triangle star pattern */

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many terms you want to print :");
        int n = sc.nextInt();

        for (int i = 1; i <= n;i++){
            for (int j = 1;j <= n;j++){
                if (j >= 1 && j <= i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}