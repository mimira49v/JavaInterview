package TasksFromAshgar;

import java.util.Arrays;

public class runninSum1dArr {
    public static void main(String[] args) {
/*
Every object has a toString() method, and the default method is to display the object's class name representation,
then @ followed by its hashcode. So what you're seeing is the default toString() representation of an int array.
To print the data in the array, you can use:
System.out.println(java.util.Arrays.toString(arr));
 */

        int [] arr = {5,2,4,5,6};
        System.out.println(Arrays.toString(runningSum(arr)));
    }
    public static int[] runningSum(int[] nums) {

        int [] result = new int[nums.length];

        result[0] = nums[0];

        for(int i = 1; i < nums.length; i++){

            result[i] = result[i - 1] + nums[i];
        }
        return result;
    }
}
