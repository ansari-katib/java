import java.util.Arrays;

// Selection Sort algorithm
// comment contains the first iteration of the code 

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = { 45, 23, 76, 10, 6, 4, 90, 70 };
        // n = 8
        int n = arr.length ;

        for(int i = 1 ; i < n ; i++){
            // index = 1 for the firt iteration
            int index = i;
            // currentValue = arr[i] => arr[1] => 23
            int currentVal = arr[i];
            
            // j = 1 -1 => 0 
            int j = i - 1;
            //                45   >    23
            while (j >= 0 && arr[j] > currentVal) {
                arr[j + 1] = arr[j];
                index = j;
                // one step back
                j--;
            }

            // in the empty index add the big value
            arr[index] = currentVal;
        }
        System.out.println("Insertion Sort  : " + Arrays.toString(arr));
    }
    
}