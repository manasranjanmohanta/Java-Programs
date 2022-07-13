package javadsa.Linear_Search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 5, 69, 281, 30, 91, 75};
        int target = 281;
        System.out.println(linearSearch(arr, target));
    }
    // method to return the index of the array where the target element is present
    static int linearSearch(int[] arr, int target){
        if (arr.length == 0){
            System.out.println("Array is empty.");
            System.exit(0);
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (target == element){
                return index;
            }
//            if (target == arr[index]){
//                return index;
//            }
        }
        return -1;
    }
}
