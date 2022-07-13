package javadsa.Linear_Search;

public class SearchInRangeLS {
    public static void main(String[] args) {
        int[] arr = {5, 69, 281, 30, 91, 75};
        int start = 1, end = 4, target = 281;
        System.out.println(findElement(arr, start, end, target));
    }
    static int findElement (int[] arr, int start, int end, int target) {
        if (arr.length == 0){
            return -1;
        }
        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if (target == element) {
                return index;
            }
        }
        return -1;
    }
}
