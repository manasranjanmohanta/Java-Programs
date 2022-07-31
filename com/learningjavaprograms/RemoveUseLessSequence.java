package com.learningjavaprograms;

import java.util.Scanner;

public class RemoveUseLessSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int gcd = 1;
        int[] a1;
        int[] a2 = new int[0];
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
             gcd = findGcd(a[i],a[j]);
               if (gcd > 1){
                 a1 = new int[removeElement(a,a[i])];
                 a2 = new int [removeElement(a1,a[j])];
               }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a2[i]);
        }
    } 

    private static int removeElement(int[] a, int target) {
        int k = 0;
        int[] arr = new int[a.length - 1];
        for (int i = 0; i < a.length; i++) {
            if (target == a[i]) {
                for (int j = i; j < a.length - 1; j++) {
                    arr[k] = a[j + 1];
                    k++;
                }
                break;
            }
                else {
                    arr[k] = a[i];
                    k++;
                }
            }
        return k;
    }

    private static int findGcd(int x, int y) {
        int gcd = 1;
        for (int i = 1; i <= x; i++) {
            if (x % i ==0 && y % i ==0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
