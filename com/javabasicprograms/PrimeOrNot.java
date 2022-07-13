package com.javabasicprograms;

import java.util.Scanner;

import java.lang.*;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        int count = 0;
        if(num == 0 || num == 1)
        {
            System.out.println("It is not a prime number.");
        }
        else
        {
            for(int i = 2; i < num; i++)
            {
                if(num % i == 0){
                    count = 1;
                    break;
                }
            }
            if(count == 1)
            {
                System.out.println("It is not a prime number.");
            }
        }
        if(count == 0)
        {
            System.out.println("It is a prime number.");
        }
    }
}
