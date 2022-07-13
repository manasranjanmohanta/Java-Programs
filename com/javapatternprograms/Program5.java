package com.javapatternprograms;

public class Program5 {
    public static void main(String[] args) {

        for (int i = 7; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= 7; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();

        }
    }
}