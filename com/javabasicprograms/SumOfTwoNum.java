package com.javabasicprograms;

import java.util.Scanner;

public class SumOfTwoNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=(a+b);
        System.out.println("The sum of two numbers is:"+sum);

    }
}

