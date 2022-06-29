package repl92to156;
/*
Create a static method with the following specs:
Returns:
an integer
Name:
countA
Parameters:
a String called s
Purpose:
count the number of occurrences of 'a' or 'A' within s
Examples:
countA("aaa") ==> 3
countA("aaBBdf8k3AAadnklA") ==> 6
Hint: How do you write a for loop to loop through every letter of a string? You've done this multiple times already :)
 */
public class repl133 {
        static int countA(String s){
            int occu=0;
            for(int i=0; i<s.length();i++){
                char x='a';
                char y='A';
                if (s.charAt(i)==x||s.charAt(i)==y){
                    occu++;
                }
            }
            return occu;
        }
        //test case below (dont change):
        public static void main(String[] args){
            System.out.println(countA("aaA")); //3
            System.out.println(countA("aaBBdf8k3AAadnklA")); //6
        }
    }
