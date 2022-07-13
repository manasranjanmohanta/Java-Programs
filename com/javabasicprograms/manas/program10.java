package com.javabasicprograms.manas;

import java.util.Scanner;

public class program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int fact = 1,m;
        m = n;
        while (n != 1){
            fact = fact * n;
            n--;
        }
        System.out.println("The factorial of " + m + " is : " + fact);
    }
}
