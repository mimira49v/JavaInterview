package TasksFromAshgar;

import java.util.TreeSet;

public class countUniqueStrings {
    public static int x;
    public static int countUniqueStrings(String str) {
        TreeSet<String> wordList = new TreeSet<String>();
        String [] words = str.split(" ");
        for(String w:words){
            wordList.add(w);
            x = wordList.size();
        }
        return x;
    }

    public static void main(String[] args) {
        String text;
        text = "In agile methodology, features of the software are delivered frequently, so that the\n" +
                "testing activity is done simultaneously with the development activity. Testing time is\n" +
                "shortened as only small features need to be tested at once.";
        System.out.println(countUniqueStrings(text));
    }
}

