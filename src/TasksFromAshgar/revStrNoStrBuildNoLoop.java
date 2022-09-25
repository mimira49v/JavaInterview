package TasksFromAshgar;

public class revStrNoStrBuildNoLoop {
        public static String c(String n, int length) {
            if(length == 1) {
                return String.valueOf(n.charAt(length-1));
            } else {
                return String.valueOf(n.charAt(length-1)) + c(n,length-1);
            }
        }

        public static void main(String args[]) {
            String s = "Hello";
            String n = c(s,s.length());
            System.out.println(n);
        }
}

