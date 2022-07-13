package javadsa.Linear_Search;

public class MinIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {45, 34, 21, 39, 50},
                {34, 67, 89, 89},
                {45, 78}
        };
        System.out.println(findMin(arr));
    }
    static int findMin(int[][] arr) {
        int min= Integer.MAX_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (min > arr[row][col]){
                    min = arr[row][col];
                }
            }
        }
        return min;
    }
}
