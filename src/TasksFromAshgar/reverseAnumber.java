package TasksFromAshgar;

public class reverseAnumber {
    public static void main(String[] args) {
        System.out.println(reverseInteger(1323));
    }

    public static int reverseInteger(int N){
        int reverse = 0;
        while(N != 0) {
            int remainder = N % 10;
            reverse = reverse * 10 + remainder;
            N = N/10;
        }
        return reverse;
    }
}

