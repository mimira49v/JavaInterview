package repl200to;

public class repl220 {
    /*

    Format the String:
    Write the logic to format the string in the below given format
    xxx-xxx-xxx
    after each 3 digits ther should be dash("-")
    if there are any spaces in the input remove those

    input ["00-44   48 555555"]

    output ["004-448-555-555"]

    input ["00-44   48 555"]

    output["004-448-555"]

    input ["00-44  #$% 48 55"]

    output ["004-448-55"]

     */
    public static void main(String[] args) {
        String X = "22223231232131";
        System.out.println(formatString(X));
    }
    public static String formatString(String s) {
        // Initialize a string builder to store the formatted string
        StringBuilder formatted = new StringBuilder();

        // Initialize a counter to keep track of the number of characters processed so far
        int counter = 0;

        // Iterate through the characters of the input string
        for (int i = 0; i < s.length(); i++) {
            // Skip spaces
            if (s.charAt(i) == ' ') {
                continue;
            }

            // Append the character to the formatted string
            formatted.append(s.charAt(i));

            // Increment the counter
            counter++;

            // If the counter is a multiple of 3, append a dash
            if (counter % 3 == 0) {
                formatted.append("-");
            }
        }

        // Return the formatted string
        return formatted.toString();
    }
}
