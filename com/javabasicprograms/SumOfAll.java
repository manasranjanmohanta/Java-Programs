package com.javabasicprograms;

import java.util.Scanner;

public class SumOfAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input=1;
        int sum = 0;
        while (input != 'x'){
            System.out.print("Enter a number:");
            input = sc.nextInt();
            sum = sum + input;
        }
        System.out.println(sum);
    }
}
