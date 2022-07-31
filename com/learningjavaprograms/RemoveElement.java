package com.learningjavaprograms;

public class RemoveElement {
    public static void main(String[] args) {
        int []a = {5 , 6, 10, 2, 9};
        int target = 10;
        int []arr = delete(a, target);
        for (int i = 0; i < arr.length-1; i++) {
            System.out.println(a[i]);
        }
    }
    static int[] delete(int []a, int target){
        for (int i = 0; i < a.length; i++) {
            if (target == a[i]){
                for (int j = i; j < a.length - 1; j++) {
                    a[j] = a[j+1];
                }
                break;
            }
        }
        return a;
    }
}
