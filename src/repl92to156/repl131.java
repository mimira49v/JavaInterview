package repl92to156;
/*
Write a method header on line two with the following specs:
Returns:

a String
Name:

thirdLetter
Parameters:

a String called s
Then complete the method by programming the following behavior
Returns every 3rd letter of the String s,
starting from the first letter.
See below examples.
Examples:

thirdLetter("hello there") ==> "hltr"
thirdLetter("technology") ==> "thly"
 */
public class repl131 {
        static String thirdLetter(String s) {
            String newStr="";
            for (int i = 0; i <= s.length(); i+=3){
                newStr+=s.charAt(i);
            }
            return newStr;
        }
            //test case below (don't change):
    public static void main(String[] args){
         System.out.println(thirdLetter("hello there")); //"hltr"
         System.out.println(thirdLetter("technology")); //"thly"
        }
    }