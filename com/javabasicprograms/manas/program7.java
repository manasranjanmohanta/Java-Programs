package com.javabasicprograms.manas;
/* java program to find out armstrong number between two integers */

import java.util.Scanner;

public class program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two integers within you want to find out the armstrong number:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println("The armstrong numbers are:");
        for(int i = n1 + 1; i < n2; i++){
            int y = i;
            int count = 0;
            while (y != 0){
                y = y / 10;
                count ++;
            }
            int sum = 0;
            y= i;
            while (y != 0){
                int armstrong = y % 10;
                sum = (int) (sum + Math.pow(armstrong,count));
                y = y / 10;
            }
            if (sum == i)
                System.out.println(i);
        }


    }
}
