package com.learningjavaprograms;

public class M {
    {
        System.out.println("from IIB");
    }
    M(){
        System.out.println("from constructor");
    }

    public static void main(String[] args) {
        System.out.println("from main");
        M m1 = new M();
    }
}
