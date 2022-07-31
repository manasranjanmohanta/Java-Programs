package HackerRank;
// --------------------------Java String reverse----------------------
import java.util.Scanner;
public class Jsr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String palindrome = "";
        for (int i = 0;i < A.length();i++){
            char ch = A.charAt(i);
            palindrome = ch + palindrome ;
        }
        if (A.compareTo(palindrome) == 0){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
