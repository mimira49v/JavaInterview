package TasksFromAshgar;

import java.util.List;

public class countDuplicates {

    public static void main(String[] args) {

    }

    public static int countDuplicates(List<Integer> numbers) {
        int[] numbersArr = new int[]{7, 2, 6, 1, 4, 7, 4, 5, 4, 7, 7, 3, 1};
        int numDup = 0, dupCount = 0;
        int previous = -1;
        for (int i = 0; i < numbersArr.length; ++i) {
            if (numbersArr[i] == previous) {
                ++numDup;
                if (numDup == 1) {
                    ++dupCount;
                }
            } else {
                previous = numbersArr[i];
                numDup = 0;
            }
        }
        return dupCount;
    }
}