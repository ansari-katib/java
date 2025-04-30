public class fibo {
    public static void main(String[] args) {
        System.out.println(Fibonacci(10));
    }

    public static int Fibonacci(int n) {

        // solved using for loop :

        int prev1 = 0 , prev2 = 1 , fibo = 0;

        for (int i = 2; i <= n; i++) {
            fibo = prev1 + prev2 ;
            prev1 = prev2 ;
            prev2 = fibo ;
        }

        return fibo;

        // recursoin 
        // in this i am using Fibonacci fomula in order to find the nth fibonacci value 
        // formula =>  " F(n - 1) + F(n - 2) "

        // if(n <= 1){
        //     return n;
        // }
        
        // return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

}

