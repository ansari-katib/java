
// the time complexity of this code  is  => O(n^2)
import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {

        int[] arr = { 45, 23, 76, 10, 6, 4, 90, 70 };
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        System.out.println("Sorted Array: " + Arrays.toString(arr));

    }

}
