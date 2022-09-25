package TasksFromAshgar;

public class primeNumber {
    //Write a java program to check wheater a given number is prime or not?
    public static void main(String[] args) {

        int given = 1;
        boolean isPrime=true;

        if(given>1){
            for (int i = 2; i < given; i++) {
                if(given % i == 0){
                    isPrime=false;
                    break;
                }
            }
        }else {
            isPrime=false;
        }
        System.out.println(given+" is prime? "+isPrime);
    }
}