package repl92to156;
/*
For you to do:

Complete the mystery method so that it takes in an integer array as a parameter, and then modifies each element based on whether it's even or odd.

If the number is even, divide it by 2. If it's odd, multiply it by 10.

Expected Output:

10 1 30 2 50
 */
public class repl130 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        mystery(a);
        // should print out 10 1 30 2 50
        int arr=a.length;
    }

    static void mystery(int[] array) {

        for (int element:array){
            if(element%2==0){
                System.out.print(element/2+" ");
            }else {
                System.out.print(element*10+" ");
            }
        }

        }
    }