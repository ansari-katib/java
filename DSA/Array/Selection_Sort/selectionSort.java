import java.util.Arrays;

// Selection sort :
// comment contain the first iteration explaination of the loop ; 

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = { 90, 65, 34, 54, 78, 23, 39, 10, 6, 3 };
        // arr_length = total element inside array in this case = 10 ;
        int arr_length = arr.length;  

        // loop ove the array (n - 1) times :
        for (int i = 0; i < arr_length - 1; i++) {
            //min_index = i => 0 
            int min_index = i;

            // finding the minimum value from the array :
            // j = i + 1 => 0 + 1 => 1  
            for (int j = i + 1; j < arr_length; j++) {
                if (arr[j] < arr[min_index]) {
                    // min_index = j => 1 
                    min_index = j;
                }
            }

            // swapping the min value with max value
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp ;

            // so after first iteration the first two value of the array become 
            // previous =  [90 ,65]
            // after =  [65 ,90]
        }

        System.out.println("Selection sort  : " + Arrays.toString(arr));

    }
}
