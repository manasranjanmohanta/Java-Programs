package com.learningjavaprograms;

public class LabelledForLoop {
    public static void main(String[] args) {
        l1: {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (i == j)
//                        break;
                        break l1;
//                        continue;
//                        continue l1; it will show errow because continue is not a loop
                    System.out.println(i + "---" + j);
                }
            }
        }
    }

}
