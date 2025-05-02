
//  Array problem :
//  lowest and higest value in array  :

public class lowestValueInArray {

    public static void main(String[] args) {

        int[] arr = {10,9,8,5,3,50,2,11};
 
        int maxval = arr[0]; 
        int minval = arr[0];

        for(int i=1 ; i<arr.length ; i++){
            if(arr[i] < minval){
                minval = arr[i];
            }
            if( arr[i] > maxval){
                maxval = arr[i];
            }
        }

        System.out.println("minimum value is : " + minval);
        System.out.println("minimum value is : " + maxval);

    }
}
