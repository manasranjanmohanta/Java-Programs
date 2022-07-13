package com.javabasicprograms;

//java program to read the number from standard input

import java.util.Scanner;

public class ReadAInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an interger:");
        int num = sc.nextInt();
        System.out.println("Entered integer is:"+num);
    }
}

