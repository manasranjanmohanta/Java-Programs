package com.javabasicprograms.manas;

import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        isPrime(n1,n2);

    }

    static void isPrime(int n1, int n2) {
        for (int i = n1 + 1; i < n2; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                {
                    break;
                }
                else{
                    System.out.println(i);
                    break;
                }
            }

        }


    }
}