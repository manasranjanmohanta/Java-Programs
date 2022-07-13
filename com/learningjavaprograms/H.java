package com.learningjavaprograms;

public class H {
    H(){
        System.out.println("from constructor");
    }

    public static void main(String[] args) {
        new H().test();
        System.out.println("from main");
    }
    void test(){
        System.out.println("from test");
    }
}
