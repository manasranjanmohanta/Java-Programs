package Arrays;
// ----------------------Passing Arrays in Function-------------------------
import java.util.Arrays;
public class ArraysPassingInFunction {
    public static void main(String[] args) {
        int[] arr = {12,56,85,98};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void change(int[] arr){
        arr[2] = 32;
    }
}
