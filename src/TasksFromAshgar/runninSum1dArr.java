package TasksFromAshgar;

import java.util.Arrays;

public class runninSum1dArr {

/*
Every object has a toString() method, and the default method is to display the object's class name representation,
then @ followed by its hashcode. So what you're seeing is the default toString() representation of an int array.
To print the data in the array, you can use:
System.out.println(java.util.Arrays.toString(arr));
 */
public static void main(String[] args) {
        int [] arr = {5,2,4,5,6};

        System.out.println(Arrays.toString(runningSum(arr)));
    }
    public static int[] runningSum(int[] nums) {
//      creating result size
        int [] result = new int[nums.length];
//      result size is equal to nums
        result[0] = nums[0];
//      i starts from 1, we are going to increment until it is smaller then array size
        for(int i = 1; i < nums.length; i++){
//          the result at i = first number - 1 cuz of the array + next number
            result[i] = result[i - 1] + nums[i];
        }
        return result;
    }
}
