package com.conversionprograms;
//---------------Java program to convert decimal to octal-------------------
import java.util.Scanner;
public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );

        System.out.println("Enter a decimal number which you want to convert to octal:");
        int decimal = sc.nextInt();

        int output = decimalToOctal(decimal);
        System.out.println("The octal representation of " + decimal + " is : " + output);
    }
    public static int decimalToOctal(int decimal){
        int octal = 0;
        int n = 0;
        while (true){
            if(decimal == 0){
                break;
            }
            else {
                int remain = decimal % 8;
                octal = octal + remain;
                decimal = decimal / 8;
            }
        }
        return octal;
    }
}
