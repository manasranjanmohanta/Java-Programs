package com.javabasicprograms.manas;
/*Java program to find largest among three numbers*/
import java.util.*;
public class program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3)
            System.out.printf("%d is greater.",num1);
        else if(num2 > num1 && num2 > num3)
            System.out.printf("%d is greater.",num2);
        else
            System.out.printf("%d is greater.",num3);


    }
}
