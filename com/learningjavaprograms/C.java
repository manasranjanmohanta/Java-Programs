package com.learningjavaprograms;
// multiple constructor
public class C {
    C(){
        System.out.println("Test");
    }
    C(int x){
        System.out.println(x);
    }

    public static void main(String[] args) {
        new C();
        new C(50);
    }

}
