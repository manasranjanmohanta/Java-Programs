package com.javabasicprograms.manas;
/* java program to find out whether a number is prime or not */
import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int isPrime = 1;
        for(int i = 2 ;i < num;i++){
            if(num % i == 0){
                isPrime = 0;
                break;
            }
        }
        if(isPrime == 1)
            System.out.println("It is prime.");
        else
            System.out.println("It is not prime.");
    }
}
