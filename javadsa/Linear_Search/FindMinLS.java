package javadsa.Linear_Search;

public class FindMinLS {
    public static void main(String[] args) {
        int[] arr = {5, 69, 281, 30, 91, 75};
        System.out.println(findMin(arr));
    }
    static int findMin(int[] arr) {
//        int max =  arr[0];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
