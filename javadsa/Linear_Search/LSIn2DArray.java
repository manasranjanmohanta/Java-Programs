package javadsa.Linear_Search;

import java.util.Arrays;

public class LSIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {45, 34, 21, 39, 50},
                {34, 67, 89, 89},
                {45, 78}
        };
        int target = 89;
        int[] ans = findElement(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] findElement(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (target == arr[i][j]) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
