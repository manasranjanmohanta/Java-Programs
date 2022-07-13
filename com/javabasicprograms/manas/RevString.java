package com.javabasicprograms.manas;

import java.util.Scanner;

public class RevString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String s = sc.nextLine();
        String rev = revString(s);
        System.out.println("The reverse of a string is : " + rev);
    }
   static String revString (String s){
        String s1 = "";
       for (int i =s.length(); i > 0; i--) {
           s1 = s1 + s.charAt(i-1);
       }
       return s1;
   }
}
