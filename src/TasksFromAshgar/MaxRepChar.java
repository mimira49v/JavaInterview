package TasksFromAshgar;

public class MaxRepChar {
    public static void main(String[] args) {
        System.out.println(countMaxChar("HELLLOOO"));
    }

    //write yor code here
    public static int countMaxChar(String S) {
        char[] array = S.toCharArray();
        int count = 1;
        int max = 0;
        char maxChar = 0;
        for (int i = 1; i < array.length; i++) { // Start from 1 since we want to compare it with the char in index 0
            if (array[i] == array[i - 1]) {
                count++;
            } else {
                if (count > max) {  // Record current run length, is it the maximum?
                    max = count;
                    maxChar = array[i - 1];
                }
                count = 1; // Reset the count
            }
        }
        if (count > max) {
            max = count; // This is to account for the last run
            maxChar = array[array.length - 1];
        }
        return max;
    }
}
