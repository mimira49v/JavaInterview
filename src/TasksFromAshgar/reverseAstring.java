package TasksFromAshgar;

public class reverseAstring {
    public static void main(String[] args) {
        String a = "Hello Syntax";
        StringBuffer sb = new StringBuffer(a);
        System.out.println("One way with reverse function : "+sb.reverse());

        // without using reverse function:

        String toReverse = "Hello World";

        //1 way using charAt();

        String reversed = " ";
        for(int i = toReverse.length()-1; i>=0; i--){
            reversed = reversed+toReverse.charAt(i);
        }
        System.out.println("Reversed String is: "+reversed);

        // Reverse  a string word by word

        String str = "Today is Sunday";
        String reversed2 = " ";
        String [] array = str.split(" ");
        for(int i = array.length-1;i>=0;i--){
            reversed2 = reversed2+array[i]+" ";
        }
        System.out.println("Reverse by word : "+reversed2);
    }

    // Method to reverse a string
    public static String X(String strToRev){
        String reversed2 = "";
        String [] array = strToRev.split(" ");
        // array length is 2 -1 = to the word "world" then when we subtract 1-1 = 0
        // 0 = to the word "Hello"
        for(int i = array.length-1;i>=0;i--){
            reversed2 = reversed2+array[i]+" ";
        }
        return reversed2;
    }
}
