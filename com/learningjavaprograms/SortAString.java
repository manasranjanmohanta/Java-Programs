package com.learningjavaprograms;

public class SortAString {
    public static void main(String[] args) {
        String s = "manas";

        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]  = temp;
                }
            }
        }
        s = String.valueOf(arr);
        System.out.println(s);
        

    }
}
