package com.learningjavaprograms;

public class J {
    int J(){
        System.out.println("from method");
        return 20;
    }

    public static void main(String[] args) {
        J j1 = new J();
        System.out.println("from main");
    }
}