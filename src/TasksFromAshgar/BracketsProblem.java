package TasksFromAshgar;

public class BracketsProblem {
        public static void main(String[] args) {
            System.out.println(isBalanced("()()()"));
        }

        public static boolean isBalanced(String s){
            int originalSize=s.length();
            String newStr=s.replaceAll("[(]","");
            int numberOfLeftParan=originalSize-newStr.length();
            int rightParanthese=newStr.length();
            return Math.abs(rightParanthese - numberOfLeftParan) == 0;
        }
    }