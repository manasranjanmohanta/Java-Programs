package com.hackerranksolutions;

import java.util.Scanner;

public class JavaAnagramSol3 {
        static boolean isAnagram(String a, String b) {
            a = a.toLowerCase();
            b = b.toLowerCase();

            if (a.length() == b.length()){
                int[] arr = new int[26];
                int index =  0;

                for (int i = 0; i < a.length(); i++) {
                    index = a.charAt(i) - 'a';
                    arr[index]++;
                }

                for (int i = 0; i < b.length(); i++) {
                    index = b.charAt(i) - 'a';
                    arr[index]--;
                }

                if (arr[index] != 0)
                    return false;
                return true;
            }
            return false;
        }

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            String a = scan.next();
            String b = scan.next();
            scan.close();
            boolean ret = isAnagram(a, b);
            System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        }
    }

