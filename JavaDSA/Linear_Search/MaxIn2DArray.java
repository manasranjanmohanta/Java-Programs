package JavaDSA.Linear_Search;

public class MaxIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {45, 34, 21, 39, 50},
                {34, 67, 89, 89},
                {45, 78}
        };
        System.out.println(findMax(arr));
    }
    static int findMax(int[][] arr) {
        int max= Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (max < arr[row][col]){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
