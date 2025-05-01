
import java.util.Arrays;
public class bubbleSort {
    public static void main(String[] args) {

        int[] arr = { 40, 30, 20, 45, 35, 10 };
        int arr_length = arr.length;

        for (int i = 0; i < arr_length - 1; i++) {
            for (int j = 0; j < arr_length - i - 1; j++) {
                
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
