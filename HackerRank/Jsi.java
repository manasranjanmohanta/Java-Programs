package HackerRank;
// ------------------------------------Java String Introduction-------------------------------
import java.util.Scanner;
public class Jsi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        System.out.println(A.length() + B.length());

        if (A.charAt(0) > B.charAt(0)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

        char c = (char) (A.charAt(0) - 32);
        char d = (char) (B.charAt(0) - 32);

        System.out.println(A.replaceFirst(String.valueOf(A.charAt(0)), String.valueOf(c)) + " " +
                B.replaceFirst(String.valueOf(B.charAt(0)), String.valueOf(d)));
    }
}
