package com.javabasicprograms.manas;
/* java program to check whether an input character is vowel or consonant */
import java.util.Scanner;

public class program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
         char c = sc.next().charAt(0);

         if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'
                 || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
             System.out.println("It is a vowel.");

         else
             System.out.println("It is a consonant.");
    }
}
