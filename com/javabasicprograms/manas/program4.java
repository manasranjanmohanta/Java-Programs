package com.javabasicprograms.manas;

import java.util.Scanner;

public class program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int largest = (n1 > n2) ?  n1 : n2;
        int lcm;
        while( true){
            if(largest % n1 == 0 && largest % n2 == 0){
                lcm = largest;
                break;
            }
            largest++;
        }
        int hcf = (n1 * n2) / lcm;
        System.out.printf("The hcf or gcd of %d and %d is %d",n1,n2,hcf);
    }
}
