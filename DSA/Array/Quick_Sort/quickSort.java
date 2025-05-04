import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] myArray = { 64, 34, 25, 12, 22, 11, 90, 5 };
        QuickSort(myArray, 0, myArray.length - 1);

        System.out.println("Quick sort : " + Arrays.toString(myArray));
    }

    public static void QuickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partitioning(arr, low, high);
            QuickSort(arr, low, pivotIndex - 1);
            QuickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partitioning(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;

    }

}
