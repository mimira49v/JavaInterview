package UDEMY;

import java.util.TreeSet;

public class WordList {
    public static void main(String[] args) {
        String text;
        text = "In agile methodology, features of the software are delivered frequently, so that the\n" +
                "testing activity is done simultaneously with the development activity. Testing time is\n" +
                "shortened as only small features need to be tested at once.";
        String [] words = text.split(" ");
        for (String w:words){
//          System.out.println(w);
        }
        System.out.println("Total number of words : "+text.length());
        // We are storing in TreeSet cuz we wanna get number of unique words
        //          TreeSet CanNot have duplicates!!!
        TreeSet <String> wordList = new TreeSet<String>();
        for (String x: words) {
            wordList.add(x);
        }
        System.out.println("Total number of unique words : "+wordList.size());
    }
}
