package TasksFromAshgar;

public class lowerUpperCountChar {
    public static void main(String[] args) {
        String s = "Welcome To AutomatioN";
        int low = 0;
        int upp = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
//          A is 65 in binary so all letters from 65-95 are Capital letters
            if (ch >= 65 && ch <= 95) {
                upp++;
            } else {
                low++;
            }
        }
        System.out.println("Lower : " + low);
        System.out.println("Upper : " + upp);
    }
}