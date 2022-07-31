package HackerRank;
//--------------------------------Java Anagrams---------------------------------

import java.util.Arrays;

public class Ja {
    public static void main(String[] args) {
        String a = "sanan";
        String b ="manas";

        char[] arr1= a.toCharArray();
        Arrays.sort(arr1);
        char[] arr2 = b.toCharArray();
        Arrays.sort(arr2);

        boolean result = Arrays.equals(arr1,arr2);
        if (result){
            System.out.println("Anagram");
        }
        else {
            System.out.println("Not Anagram");
        }
    }
}

