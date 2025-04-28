import java.util.*;

class calculater {
    public static void main(String[] args){

        String operator;
        int first , second , result ;

        Scanner sc = new Scanner(System.in);
        // take two input from user as first , second ..
        System.out.print("enter a fist number :"); 
        first = sc.nextInt();

        System.out.print("enter a fist number :"); 
        second = sc.nextInt();

        // choose operator to perform operation 
        System.out.print("Enter the operator to perform operation you wnat : ( + , - , * , / ) : "); 
        operator = sc.next();


// used switch conditional statement :

        // switch(operator){
        //     case "+" :
        //           result = first + second ;
        //           System.out.print("addition of two number is : ");
        //           System.out.print(result);
        //         break ;
        //     case "-" :
        //           result = first - second ;
        //           System.out.print("substraction of two number is : ");
        //           System.out.println(result);
        //         break ;
        //     case "*" :
        //           result = first * second ;
        //           System.out.print("multiplicaiton of two number is : ");
        //           System.out.println(result);
        //         break ;
        //     case "/" :
        //           result = first / second ;
        //           System.out.print("division of two number is : ");
        //           System.out.println(result);
        //         break ;
        //     default :
        //         System.out.println("Invalid operator..");
        // }

        
// used if , else if , else , conditional statement :

        // if( operator == "+" ){
        //     result = first + second ;
        //     System.out.print(result);

        // } else if( operator == "-" ){
        //     result = first - second ;
        //     System.out.print(result);

        // } else if( operator == "*" ){
        //     result = first * second ;
        //     System.out.print(result);

        // } else if ( operator == "/" ){
        //     result = first / second ;
        //     System.out.print(result);

        // }else {
        //     System.out.println("Inavalid operator..");
        // }

    }
}