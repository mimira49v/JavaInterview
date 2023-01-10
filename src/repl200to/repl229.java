package repl200to;

public class repl229 {
    /*
    Count the maximum repetition of a character examples are
    given below

    "abscaaaaabdddd" -> 6

    "dddddddddd" -> 10

    "daccccdndeeeennnnndddddd" -> 9

    "a"->1
    ""-> 0
     */
    public static void main(String[] args) {
        System.out.println(countMaxChar("HELLLOOO"));
    }

    public static int countMaxChar(String s){
        // Initialize the maximum repetition to 0
        int maxRepetition = 0;

        // Initialize the current repetition to 1
        int currentRepetition = 1;

        // Iterate through the characters of the string
        for (int i = 1; i < s.length(); i++) {
            // If the current character is the same as the previous character,
            // increment the current repetition
            if (s.charAt(i) == s.charAt(i - 1)) {
                currentRepetition++;
            } else {
                // Otherwise, reset the current repetition to 1
                currentRepetition = 1;
            }
            // Update the maximum repetition if necessary
            maxRepetition = Math.max(maxRepetition, currentRepetition);
        }
        return maxRepetition;
    }
}
