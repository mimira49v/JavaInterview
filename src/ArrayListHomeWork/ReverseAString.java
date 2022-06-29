package ArrayListHomeWork;

public class ReverseAString {
/*
1.
Write a program that reads two people's first
names and if they're expecting boy or girl?
Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL

Tas3: Create a String and if the String is not empty perform the following:
if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String.
Create a String and print it in reverse order (Sunday ? yadnuS).
 */



    public static void main(String[] args) {
     // task1
        String father = "Danilo";
        String mother = "Mariam";
        String expectation = "girl";
        String firstPart="";
        String secondPart="";
        if(expectation.equalsIgnoreCase("boy")){
            firstPart=father.substring(0,father.length()/2);
            secondPart=mother.substring(mother.length()/2);
        }else if(expectation.equalsIgnoreCase("girl")){
            firstPart=father.substring(0,mother.length()/2);
            secondPart=mother.substring(father.length()/2);
        }
        System.out.println(firstPart+secondPart);

        String name="HeLlo";
        int mid=name.length()/2;

        //reverse string task
        String day = "Sunday";
        String reverse = "";
        // whole length is stored inside i=6
        for (int i = day.length() - 1; i >= 0; i--) {
            reverse += day.charAt(i); // this is concatenation, so it prints everything together yadnuS!!!
        }
        System.out.println(reverse);

        // task 3
        if(!name.isEmpty()) {
            if(name.length()%2==1 && name.length() >=3) {
                System.out.println(name.charAt(name.length()/2));
                    } else {
                          System.out.println("The string has even number of chars");
                    }
        } else {
            System.out.println("The string is empty");
        }

    }
}