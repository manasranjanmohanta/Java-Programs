package HackerRank;
// ----------------------------Java String Comparison------------------------
import java.util.Scanner;
public class Jsc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        sc.close();

        System.out.println(getSmallestAndLargest(s,k));
    }
    public static String getSmallestAndLargest(String s,int k){
        String currentString = s.substring(0,k);
        String largest = currentString;
        String smallest = currentString;

        for (int i = k; i < s.length() ; i++) {
            currentString = currentString.substring(1,k) + s.charAt(i);

            if (largest.compareTo(currentString) < 0){
                largest = currentString;
            }
            else if(smallest.compareTo(currentString) > 0){
                smallest = currentString;
            }

        }
        return(smallest + "\n" + largest);

    }
}
