package com.learningjavaprograms;

public class E {
    E() {
        System.out.println("A");
        return;
    }

    public static void main(String[] args) {
        E e1 = new E();
        System.out.println("Test");
    }

}
