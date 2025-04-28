import java.util.*;

class patterns{
    public static void main(String args[]){
 
    

// Q1 : solid rectangle pattern :
    // use nested loop for pattern problem :

    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter the x-axis value : ");
    // int x = sc.nextInt();
    // System.out.print("Enter the y-axis value : ");
    // int y = sc.nextInt();

    // for(int i = 1 ; i <= x ; i++){
    //     // inner loop :
    //     for (int j = 1 ; j <= y ; j++){
    //         System.out.print("*");
    //      }
    // System.out.println();
    //  }


// Q2 : print hollow rectangle pattern :

    // Scanner sc = new Scanner(System.in);

    // System.out.print("Enter the x-axis value : ");
    // int x = sc.nextInt();
    // System.out.print("Enter the y-axis value : ");
    // int y = sc.nextInt();
    
    // //outer loop:
    // for(int i = 1 ; i <= x ; i++){
    //     // inner loop :
    //     for (int j = 1 ; j <= y ; j++){
    //         if( i == 1 || j == 1 || i == x || j == y ){
    //         System.out.print("*");

    //         } else {
    //             System.out.print(" ");
    //         }
    //      }
    // System.out.println();
         
    //  }

// Q3 : print half pyramid pattern :

//   Scanner sc = new Scanner(System.in);
//   int x = sc.nextInt();
//   // int y = sc.nextInt();
//   for(int i = 1 ; i <= x ; i++){
//       for(int j = 1 ; j <= i ; j++){
//           System.out.print("*");
//       }
//       System.out.println();
//   }


// Q4 : print invert half pyramid pattern :

// Scanner sc = new Scanner(System.in);
//   int x = sc.nextInt();
//   // int y = sc.nextInt();
//   for(int i = x ; i >= 1 ; i--){
//       for(int j = 1 ; j <= i ; j++){
//           System.out.print("*");
//       }
//       System.out.println();
//   }


// Q5 : print inverted half pyramid (rotated by 180 deg) pattern :

// Scanner sc = new Scanner(System.in);
//   int x = sc.nextInt();

//   for(int i=1 ; i<=x ; i++){
//     //   for(int j = 0 ; j <= x-i ; j++){  // reverse half pyramid pattern
//        for(int j=1 ; j<=x-i ; j++){    
//           System.out.print(" ");
//       }

//       for(int j=1 ; j<=i ; j++){
//         System.out.print("*");
//       }
//       System.out.println();
//   }



// Q6 : half pyramid with number :

// Scanner sc = new Scanner(System.in);
//   int x = sc.nextInt();

// // outer loop 
// for(int i=1 ; i<=x ; i++){
//     for(int j=1 ; j<=i ; j++){
//     System.out.print(j+" ");
   
//     }
//     System.out.println();
// }


// Q7 : print inverted half pyramid with numbers pattern :
  
// Scanner sc = new Scanner(System.in);
//   int x = sc.nextInt();

// // outer loop 
// for(int i=1 ; i<=x ; i++){
//     for(int j=1 ; j<=x-i+1 ; j++){
//     System.out.print(j+" ");
   
//     }
//     System.out.println();
// }


// Q8 : print floy'd pattern :

// Scanner sc = new Scanner(System.in);
//   int x = sc.nextInt();
//   int num = 1 ; 

//   for(int i=1 ; i<=x ; i++){
//     for(int j=1 ; j<=i ; j++){
//         System.out.print(num);
//         num++ ;   // num++ ==  num = num + 1 ;
//     }
//     System.out.println();
//   }


// Q9 : print 0-1 triangle patterns : 

//  Scanner sc = new Scanner(System.in);
//   int x = sc.nextInt();

// // outer loop 
// for(int i=1 ; i<=x ; i++){
//     for(int j=1 ; j<=i ; j++){
//         int sum = i+j ; 
//         if( sum % 2 == 0 ){
//             System.out.print(1+" ");
//         }else{
//             System.out.print(0+" ");
//         }
        
//     }
//     System.out.println();
// }



// Q10 : 

// Scanner sc = new Scanner(System.in);

// System.out.print("Enter your marks : ");
// int y ;

//  do{
//     System.out.print("Enter your marks : ");
//     int x = sc.nextInt();
    
//     if(x >= 90 && x <= 100){
//        System.out.println(x +" = is good marks");

//     }else if(x >= 60 && x <= 89){
//        System.out.println(x +" = is also good marks");

//     }else if(x >= 0 && x <= 59){
//        System.out.println(x +" = this marks is good as well");

//     } else{
//         System.out.println(x +" = number is invalid");
//     }

//     System.out.print("want to continue ? \n if yes (1) \n if no (0) \n choose :");
//     y = sc.nextInt();

//   }while(y == 1);
   
















    }
}