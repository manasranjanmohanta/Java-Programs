package com.javabasicprograms;

//multiply two floating point values
import java.util.Scanner;

public class MultiplyTwofloatingPointNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two floating point values:");
        float value1 = sc.nextFloat();
        float value2 = sc.nextFloat();
        float multiply = (value1)*(value2);
        System.out.println("The multiplication of two floating point values is:"+multiply);
    }
}
