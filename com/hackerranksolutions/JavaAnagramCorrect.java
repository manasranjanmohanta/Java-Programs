package com.hackerranksolutions;

public class JavaAnagramCorrect {
    public static void main(String[] args) {
        String s1 = "anasm";
        String s2 = "mAnas";

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        if (arr1.length == arr2.length){
            for (int i = 0; i < arr1.length; i++) {
                for (int j = i + 1; j < arr1.length; j++) {
                    if (arr1[i] >arr1[j]){
                        char temp = arr1[i];
                        arr1[i] = arr1[j];
                        arr1[j] = temp;
                    }
                }
            }
            for (int i = 0; i < arr2.length; i++) {
                for (int j = i + 1; j < arr1.length; j++) {
                    if (arr2[i] > arr2[j]) {
                        char temp = arr2[i];
                        arr2[i] = arr2[j];
                        arr2[j] = temp;
                    }
                }
            }

            boolean result = true;
            for (int i = 0; i <arr1.length ; i++) {
                if (arr1[i] != arr2[i]) {
                    result = false;
                    break;
                }
            }
            if (result){
                System.out.println("Anagram");
            }
            else {
                System.out.println("Not Anagram");
            }
        }
        else{
            System.out.println("Not Anagram");
        }
    }
}
