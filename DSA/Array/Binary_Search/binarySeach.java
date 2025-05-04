
public class binarySeach {
    
    public static void main(String[] args) {
    
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int targetVal = 2 ;

        int response = BinarySearch(arr , targetVal);

        if(response != -1){
            System.out.println("value : " + targetVal + " " + "found at index : " + response);
        } else {
            System.out.println("value not found in the array ");
        }   
    }

    public static int BinarySearch(int[] arr ,int target){
        int right = arr.length -1;
        int left = 0;

        while (left <= right) {
            int mid = (left + right) / 2 ;
             
            if(arr[mid] == target){
                return mid ;
            }

            if(arr[mid] < target){
                left = mid + 1;
            }

            if(arr[mid] > target){
                right = mid -1;
            }
        }
        return -1 ;
    }



}
