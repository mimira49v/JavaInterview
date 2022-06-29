package TasksFromAshgar;

import java.util.Arrays;

public class SumOfTheArray {

    public static int SUM(int[] arr){
        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            sum +=  arr[j];
        }
        return sum;
    }

    public static void main(String[] args) {

//  first solution
    int [] arr = {1,2,3,4};
    int sum = Arrays.stream(arr).sum();

    System.out.println(sum);
// ==============================================================//

//  second solution
    System.out.println(SUM(arr));

    }
}
