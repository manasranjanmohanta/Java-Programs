package javadsa.Linear_Search;

public class FindMaxLS {
    public static void main(String[] args) {
        int[] arr = {5, 69, 281, 30, 91, 75};
        System.out.println(findMax(arr));
    }
    static int findMax(int[] arr) {
//        int max =  arr[0];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
