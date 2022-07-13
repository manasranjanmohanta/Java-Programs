package com.learningjavaprograms;

public class PrintTwoDimArrayEnhancedLoop {
    public static void main(String[] args) {
        int[][] a  = {{23, 34, 32}, {45, 65, 78}, {98, 75, 38}};
        for ( int[] x1 : a){
            for (int x2 : x1){
                System.out.println(x2);
            }
        }
    }
}
