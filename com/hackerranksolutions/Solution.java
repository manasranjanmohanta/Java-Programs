package com.hackerranksolutions;

import java.util.Scanner;
import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        boolean result = n.isProbablePrime(1);
        if (result) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
