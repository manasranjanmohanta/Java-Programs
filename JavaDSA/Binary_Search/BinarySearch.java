package JavaDSA.Binary_Search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        int target = 36;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    // return the index
    // return -1 if it doesn't exit
    static int binarySearch (int[] arr, int target) {
        int start = 0; //  points to the 0th index
        int end = arr.length - 1; // points to the last index

        while (start <= end) {

            int mid = start + (end - start)/ 2;
            if (target > arr[mid]) {
                start = mid + 1;
            }
            else if (target < arr[mid]) {
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
