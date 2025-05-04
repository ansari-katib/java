import java.util.Arrays;

public class redixSort {
    public static void main(String[] args) {

        int[] myArray = { 170, 45, 75, 90, 802, 24, 2, 66 };
        System.out.println("Original array : " + Arrays.toString(myArray));

        int[][] redixArr = new int[10][myArray.length];
        int[] counts = new int[10];
        int maxVal = findMax(myArray);
        int exp = 1 ;

        while ( maxVal / exp > 0) {
            for(int val : myArray){
               int redixIndex = (val / exp) % 10 ;
               redixArr[redixIndex][counts[redixIndex]] = val ;
               counts[redixIndex]++; 
            }

            int pos = 0 ;
            for(int i= 0 ; i < 10 ; i++){
                for(int j = 0 ; j < counts[i] ; j++){
                    myArray[pos] = redixArr[i][j];
                    pos++;
                }
                counts[i] = 0;
            }
            exp *= 10;
        
        }
        System.out.println("Redix Sort array: " + Arrays.toString(myArray));
        
    }

    public static int findMax(int[] arr) {
        int maxVal = arr[0];
        for (int num : arr) {
            if (num > maxVal) {
                maxVal = num;
            }
        }
        return maxVal;
    }

}
