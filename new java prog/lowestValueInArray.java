
//  Array problem :
//  lowest and higest value in array  :

public class lowestValueInArray {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 10, 5 };

        int minVal = arr[0];
        int maxVal = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minVal) {
                minVal = arr[i];
            }

            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }

        System.out.println("minimum value is : " + minVal);
        System.out.println("minimum value is : " + maxVal);

    }
}
