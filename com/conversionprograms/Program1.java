package com.conversionprograms;
// Java programs to convert a binary number into decimal number
import java.util.Scanner;
public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the binary number you want to convert to decimal : ");
        int binary = sc.nextInt();

        int output = binaryToDecimal(binary);

        System.out.println("The decimal representation of " + binary + " is : " + output);

    }
    public static int binaryToDecimal(int binary){
        int decimal = 0;
        int n = 0;
        while (true){
            if (binary == 0){
                break;
            }
            else {
                int temp = binary % 10;
                decimal = (int) ( decimal + temp * Math.pow(2,n));
                binary = binary / 10;
                n++;
            }
        }
        return decimal;
    }
}
