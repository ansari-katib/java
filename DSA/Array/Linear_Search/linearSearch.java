
public class linearSearch {
    public static void main(String[] args) {
        int[] myArray = { 64, 34, 25, 12, 22, 11, 90, 5 };
        int targetVal = 12 ;

        int response = Linear_Search(myArray , targetVal);

        if(response != -1){
            System.out.println("value : " + targetVal + " " + "found at index : " + response);
        } else {
            System.out.println("value not found in the array ");
        }
    }

    public static int Linear_Search(int[] arr , int target){
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == target){
                return i ;
            }
        }

        return -1 ;
    }
}
