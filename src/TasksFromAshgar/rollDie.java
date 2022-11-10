package TasksFromAshgar;

public class rollDie {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        int x = 4;

        System.out.println(twoSum(arr,x));

    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        // In case there is no solution, we'll just return null
        return null;
    }
}