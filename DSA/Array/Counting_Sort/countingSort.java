import java.util.Arrays;

public class countingSort {

    public static void countingSort(int[] arr){
        
        // Step 1: Find the maximum value correctly
        int maxVal = arr[0];
        for(int i = 1 ; i<arr.length ; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }

        // Step 2: Create count array and fill frequencies
        int[] count = new int[maxVal + 1];
        for(int i = 0 ; i< arr.length ; i++){
            count[arr[i]]++;
        }

        // Step 3: Build the sorted array
        int index = 0;
        for(int  i= 0 ; i<= maxVal ; i++){
            while (count[i] > 0) {
                arr[index++] = i ;
                count[i]--;
            }
        }
        
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 6, 3, 3, 1, 6, 5, 2, 3};
        countingSort(arr);
        System.out.println("Counting Sort : "+ Arrays.toString(arr));
    }
}
