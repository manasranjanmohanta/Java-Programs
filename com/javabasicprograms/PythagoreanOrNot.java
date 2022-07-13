package com.javabasicprograms;

import java.util.Scanner;

public class PythagoreanOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        boolean b = isPythagorean(n1,n2,n3);
        System.out.println((b)?"Pythagorean":"Not Pythagorean");
    }
    static boolean isPythagorean(int n1,int n2,int n3){
        int largest = 0;
        int small1 = 0;
        int small2 = 0;
        if (n1 > n2 && n1 > n3){
            largest = n1;
            small1 = n2;
            small2 = n3;
        }
        else if (n2 > n1 && n2 > n3){
            largest = n2;
            small1 = n1;
            small2 = n3;
        }
        else {
            largest = n3;
            small1 = n1;
            small2 = n2;
        }
        double largeSquare = Math.pow(largest,2);
        double smallSumSquare = Math.pow(small1,2) + Math.pow(small2,2);

        return largeSquare == smallSumSquare;
    }
}
