package TasksFromAshgar;

public class Fibonacci {

    private static long [] fibCache;

    public static void main(String[] args) {
        int n = 6;

        fibCache = new long[n + 1];

        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i)+"  ");
        }



    }

    private static long fibonacci(int n) {
        if(n <= 1) {
            return n;
        }
        if(fibCache[n] !=  0) {
            return  fibCache[n];
        }

        long nthFibNum = (fibonacci(n - 1) + fibonacci(n - 2));
        fibCache[n] = nthFibNum;
        return nthFibNum;

    }
}
