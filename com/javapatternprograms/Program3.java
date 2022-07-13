package com.javapatternprograms;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many terms you want to print : ");
        int n = sc.nextInt();

        for (int i = 1;i <= n;i++){
            for (int j = 1;j <= (2 * n) - 1;j++){
                if (j >= (n + 1) - i && j <= (n - 1) + i)
//                if (j >= 5 - i && j <= 3 + i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
