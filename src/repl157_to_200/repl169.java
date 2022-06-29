package repl157_to_200;
/*
For you to do:
Create final method avgElements that will average all the elements in an integer array (passed to the method as a parameter) and return the average.
Expected Output:
4.8
 */
public class repl169 {
    public static double avgElementsX_2(int[] a) {
        double sum = 0;
        int length = a.length;
        double average = 0;
        for (int j : a) {
            sum += j;
        }
        average = sum / length;
        return (double) average;
    }
    public static void main(String[] args) {
        int[] a = {2,7,3,8,4};
        System.out.println(avgElementsX_2(a)); //should print 4.8

    }
}

