package TasksFromAshgar;

public class main {
        public static void main(String[] args) {
            String a = "Hello world";
            System.out.println(x(a));
        }

        public static String x(String strToRev){
            String reversed2 = "";
            String [] array = strToRev.split(" ");
            for(int i = array.length-1;i>=0;i--){
                reversed2 = reversed2+array[i]+" ";
            }
            return reversed2;
        }
    }


