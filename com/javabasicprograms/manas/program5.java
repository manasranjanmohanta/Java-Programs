package com.javabasicprograms.manas;

import java.util.Scanner;

public class program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number upto you want  to find the prime number:");
        int n = sc.nextInt();

        System.out.println("All the prime numbers within 1 to " + n +" are:");
        for(int i = 2;i < n;i++){
            int isPrime = 1;
            for(int j = 2;j < i;j++){
                if(i % j == 0) {
                    isPrime = 0;
                    break;
                }
//                else
//                    isPrime = 1;
                }
            if(isPrime == 1)
                System.out.print(i+ " ");

                }
            }
        }

