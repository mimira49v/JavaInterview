package TasksFromAshgar;

public class Fibonacci {

    private static long[] fibCache;

    public static void main(String args[]) {

        int n = 50;
//      0112  // to get a 3d fibonacci number we need an array size 4 to get it
        fibCache = new long[n+1];
        for (int i = 0; i<= n; i++){
            System.out.print(fibonacci(i)+"  ");
        }
    }

    private static long fibonacci(int n) {
        if(n <=1){
            return n;
        }

        if(fibCache[n] != 0){
            return fibCache[n];
        }

        long nthFibonacciNum = (fibonacci(n - 1 ) + fibonacci( n - 2 ));
        fibCache[n] = nthFibonacciNum;
        return nthFibonacciNum;
    }
}
