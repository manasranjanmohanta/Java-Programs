package com.javabasicprograms;

import java.util.Scanner;

//java program to swap two numbers
public class SwapTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1 = sc.nextInt();
        System.out.print("Enter a second number:");
        int num2 = sc.nextInt();
        System.out.println();
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("After swapping...\nthe first number is:"+ num1 + "\nAnd the second number is:" + num2);
    }
}
