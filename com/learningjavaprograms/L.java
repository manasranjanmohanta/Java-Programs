package com.learningjavaprograms;

public class L {
    {
        System.out.println("from IIB");
    }
    L(){
        System.out.println("from constructor");
    }

    public static void main(String[] args) {
        L l1 = new L();
        System.out.println("from main");
    }
}
