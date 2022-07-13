package com.conversionprograms;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a decimal number :");
        int decimal = sc.nextInt();

        int num = decimal;

        int octal = 0;
        int i = 1;

        while (num > 0){
            int remain = num % 8;
            octal = octal + remain * i;
            i = i * 10;
            num = num / 8;

        }
        System.out.println("The octal representation of " + decimal +
                " is : " + octal);
    }
}
