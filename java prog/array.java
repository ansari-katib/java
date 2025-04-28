import java.util.*;

class function{
    public static void main(String args[]){
        
// array in java are like a list of elements of the same data type 
// i.e : a list of integers , a list of boolean etc. 
// there are multiple methods to create an array .


    //     // array :
    //     // int[] marks = new int[3];     // <-- define an array : 
    //     // int marks[] = new int[3];        //   <-- define an arrray :

    //     // int marks[] ={ 92 ,95,93};    // <-- define an array :
    
    //     // marks[0] = 92 ;
    //     // marks[1] = 95 ;
    //     // marks[2] = 93 ;
    
    //     //  System.out.println(marks[1]);
    //     // System.out.println(marks[2]);
    //     // System.out.println(marks[0]);
       
    //    // loop : 
    //     for(int i=0 ; i<3 ; i++){
    //     System.out.println(marks[i]);

    //     }


// take array input from the user , and also find the number you want from array : linear search algo : this is the searching technique


    //    Scanner sc = new Scanner(System.in);
    //    int n = sc.nextInt();

    //    // array :
    //    int marks[] = new int [n];   //  define array :

    //     // array data  input loop :
    //     for(int i=0 ; i<n ; i++){
    //         marks[i] = sc.nextInt();
    //     }

    //     // searching index number
    //     System.out.print("seaarch numbers you want = ");
    //     int x = sc.nextInt();

    //     // output loop : 
    //     for(int i=0 ; i<marks.length ; i++){
    //     // System.out.print(marks[i] + ","); //  printing the data array contain :
         
    //      if( marks[i] == x){ 
    //       System.out.println("Number is present at this index = " + i);
        
    //      }

    //    }


// Q1 : take name form the user as input and print them on the screen :

    //    Scanner sc = new Scanner(System.in);
    //    // take input from the user :
    //    int size = sc.nextInt();

    //    // array size:
    //    String name[] = new String[size];

    //    // input
    //    for (int i=0 ; i<size ; i++){ 
    //       name[i] = sc.next();
    //    }

    //    // output
    //    for(int i=0 ; i<size ; i++){
    //     System.out.print(name[i]);
    //    }


// Q2 : find the minimum and maximum integer of an array :
 
       
    //    Scanner sc = new Scanner(System.in);
    //    int n = sc.nextInt() ; 

    //    int value[] = new int[n];

    //    // input values :
    //    for(int i=0 ; i<n ; i++){
    //     value[i] = sc.nextInt();
    //    }

    //    // intitializing two varible :
    //    int max = Integer.MIN_VALUE; 
    //    int min = Integer.MAX_VALUE;

    //    for(int i=0 ; i<value.length ; i++){
    //     if(value[i] < min){
    //         min = value[i] ; 
    //     }
    //     if(value[i] > max){
    //         max = value[i];
    //     }
    //    } 
    //    System.out.println("maximum value is = " + max);
    //    System.out.println("minimum value is = " + min);



// Q3: take input number in array and check if it is sorted or not :

        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
          
        // // array :
        // int num[] = new int[size];

        // // array input loop :
        // for(int i=0 ; i<size ; i++){
        //     num[i] = sc.nextInt();
        // }
        
        // boolean isAssending = true ;

        // for(int i=0 ; i<num.length-1 ; i++){

        //    if(num[i] > num[i+1]){
        //       isAssending = false ;   
        //     }
        // }

        // if(isAssending){
        //     System.out.println("array is in assending order");
        // } else{
        //     System.out.println("array is in desenging order");
        // }








    }
}