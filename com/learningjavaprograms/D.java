package com.learningjavaprograms;



public class D {
    D(){
        D d1 = new D(10);
        System.out.println("Test");
    }
    D(int x){
    System.out.println(x);
    }

    public static void main(String[] args) {
        D d2 = new D();
    }

}
