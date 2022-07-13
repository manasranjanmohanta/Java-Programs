package com.learningjavaprograms;

public class G {
    G(){
        System.out.println("from constructor");
    }

    public static void main(String[] args) {
        G.test();
        G g1 = new G();
        g1.test();
        System.out.println("from main");
    }
    public static void  test(){
        System.out.println("from test");
    }
}
