import java.util.ArrayList;

public class concatArray {
      public static void main(String[] args) {
        int[] a = {1, 2 , 3 , 4};
        int[] b = {5, 6 , 7 , 8};

         ArrayList<Integer> newArr = new ArrayList<>();
         
        for(int i =0 ; i<a.length ; i++){
            newArr.add(a[i]);
        }

        for(int i =0 ; i<b.length ; i++){
            newArr.add(b[i]);
        }

         System.out.print(newArr);
         
      }
}
