package TasksFromAshgar;
public class lastStringLenght {
    public static int length_Of_last_word(String str1) {
        int length_word = 0;
        String[] words = str1.split(" "); // needs space in regex!!!
        if(words.length>0) {
            length_word = words.length-1;
        } else {
            length_word = 0;
        }
        return length_word;
    }

        public static void main(String[] args) {
            String s = "";
            String str1 = "The length of last word";
            System.out.println(str1 + ":  " + length_Of_last_word(str1));
            System.out.println(length_Of_last_word(s));
    }
}
