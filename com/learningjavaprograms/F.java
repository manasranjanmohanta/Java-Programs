package com.learningjavaprograms;

public class F {
    F(){
        System.out.println("from c");
    }

    public static void main(String[] args) {
        F f1 = new F();
        f1.test();
        System.out.println("from main");
    }
    void test(){
        System.out.println("from test");
    }
}
