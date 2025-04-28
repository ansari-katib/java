import java.util.*;

class function{
  
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);


// Get bit : (binary AND operation) 

    // Bit Mask : the binary left and right shift process is called as bit mask .
    // process : 1 : calculate bit mask : 2 : perform operation

    //   int n = 5 ;  // intput 5
    // //   int pos = 2 ; // position 2 = ans = bit was one 
    // //   int pos = 3 ; // position 3 = ans = bit was zero
    //   int bitmask = 1 << pos ;   //  0001 << 2 = 0100

    //   if((bitmask & n) == 0) {  // 0100 & (binary AND opr) 0101 = 0100 
    //     System.out.println("bit was zero");
    //   }else {
    //     System.out.println("bit was one");
    //   }
  

// Set bit : (binary OR operation)

       
    //   int n = 5 ;  // intput = 5
    //   int pos = 1 ; // position = 1
    //   int bitmask = 1 << pos ;   

    //   if((bitmask | n) == 0) { // OR operation  
    //     System.out.println("bit was zero");
    //   }else {
    //     System.out.println("bit was one");
    //   } 

    // int newNumber = bitmask | n ;
    // System.out.println(newNumber);


// clear bit : (binary NOT operation)

    //   int n = 5 ;  // intput = 5
    //   int pos = 2 ; // position = 2
    //   int bitmask = 1 << pos ;   
    //   int notBitmask = ~(bitmask); // ~ (binary one's compliment oper)
    
    //   int newNumber = notBitmask & n ; 
    //   System.out.println(newNumber);
      
      
// update bit : 


        //  int oper = sc.nextInt(); // oper : 1 = set oper : oper : 0 = clear oper
        //  int n = 5 ;  // 0101
        //  int pos = 1 ; // update bit to 1 else update bit to 0
        //  int bitmask = 1 << pos ;
       
        // if(oper == 1){
              
        //  // set operation : OR oper 
        //  int newNumber = bitmask | n ;
        //  System.out.println(newNumber);
        // } else {

        //  // clear oper : NOT oper
        //   int newbitmask = ~(bitmask);
        //  int newNumber = newbitmask & n ;
        //  System.out.println(newNumber);
        // }
 
       


      
      
       


  }
}