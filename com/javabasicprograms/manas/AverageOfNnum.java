package com.javabasicprograms.manas;

import java.util.Scanner;

public class AverageOfNnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many number you want to enter : ");
        int n = sc.nextInt(); // numbers of element

        int[] arr = new int[n]; // memory allocation for array arr

        System.out.println("Enter the elements into array : ");
        for (int i = 0;i < n;i++) {
            arr[i] = sc.nextInt();
        }
        double result = getAverage(arr, n);
        System.out.println("The Average of " + n + "is : " + result);
    }
    // function to find average
    static double getAverage(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++){
            sum += arr[i];
        }
        double avg = (double) sum / n;
        return avg;
    }
}
