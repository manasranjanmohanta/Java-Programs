package com.javabasicprograms.manas;

import java.util.Scanner;

public class ReverseOfAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String s = sc.nextLine();

        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        for (int i =(arr.length)-1; i >= 0 ; i--) {
            System.out.print(arr[i]);
        }

    }
}
