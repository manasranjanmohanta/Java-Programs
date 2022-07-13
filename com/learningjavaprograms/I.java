package com.learningjavaprograms;

public class I {
    void I(){
        System.out.println("from method");
        return;
    }

    public static void main(String[] args) {
        I i1 = new I();
        System.out.println("from main");
    }
}

