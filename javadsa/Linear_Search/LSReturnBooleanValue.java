package javadsa.Linear_Search;

public class LSReturnBooleanValue {
    public static void main(String[] args) {
        int[] arr = {5, 69, 281, 30, 91, 75};
        int target = 281;
        System.out.println(findElement(arr, target));
    }
    static boolean findElement (int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (target == element) {
                return true;
            }
        }
        return false;
    }
}
