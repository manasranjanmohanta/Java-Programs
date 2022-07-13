package com.conversionprograms;
// -------------Java program to convert binary to decimal-----------------
import java.util.Scanner;
public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number:");
        int binary= sc.nextInt();
        int num = binary;
        int decimal = 0;
        int n = 0;
        while (num > 0){
            int temp = num % 10;
            decimal = (int) (decimal + (temp * Math.pow(2,n)));
            num = num / 10;
            n++;
        }
        System.out.println("The decimal representation of " + binary + " is " + decimal );


    }
}
