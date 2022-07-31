package HackerRank;

import java.util.Arrays;

public class RE {
    public static void main(String[] args) {
        int [] arr = {5, 6, 10, 2, 9};
        int target = 10;
        RemoveElement(arr, target);
        System.out.println(Arrays.toString(arr));
    }
    static void RemoveElement(int []arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                arr[i] = arr[i+1];
            }
        }
    }
}
