package TasksFromAshgar;

import java.util.ArrayList;
import java.util.List;

public class sumTwoNum222 {
        public static void main(String[] args) {
            List<Integer> arr = new ArrayList<>();
            arr.add(5);
            arr.add(3);
            arr.add(8);
            arr.add(9);
            arr.add(10);
            arr.add(11);
            arr.add(5);
            System.out.println(findMaxSum(arr));
        }

        public static int findMaxSum(List<Integer> list) {
            int max1 = Integer.MIN_VALUE;
            int max2 = Integer.MIN_VALUE;
            for (int number : list) {
                if (number > max1) {
                    max2 = max1;
                    max1 = number;
                } else if (number > max2) {
                    max2 = number;
                }
            }
            return max2+max1;
        }
    }
