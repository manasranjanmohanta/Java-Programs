package com.conversionprograms;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int  decimal = sc.nextInt();

        StringBuilder binary = new StringBuilder();

        while (decimal > 0){
            int remain = decimal % 2;
            binary.insert(0, remain);
            decimal = decimal / 2;
        }
        System.out.println("The binary representation of " + " is " + binary);

    }
}
