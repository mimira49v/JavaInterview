package TasksFromAshgar;

public class BalancedParantheses {
    public static void main(String[] args) {
        System.out.println(isBalanced("()()()()()"));
    }
    static boolean isBalanced(String s){
        int originalSize=s.length();
        String newStr=s.replaceAll("[(]","");
        int numberOfLeftParan=originalSize-newStr.length();
        int rightParanthese=newStr.length();
        return Math.abs(rightParanthese - numberOfLeftParan) == 0;
    }
}
