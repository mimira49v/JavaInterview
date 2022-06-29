package repl92to156;
/*
For you to do:

1) Create one method as syntaxTechnologies and write the logic for that method in println statement as "Welcome to Syntax Technologies!"

2) Create another method as syntaxStudents and write the logic for that method in println statement as "Welcome Syntax Students!"

3) Call both methods

Expected Output:

Welcome to Syntax Technologies!
Welcome Syntax Students!
 */
public class repl111 {

    void synt (){
        System.out.println("Welcome to Syntax Technologies!");
    }
    void tech(){
        System.out.println("Welcome Syntax Students!");
    }

    public static void main(String[] args) {

        repl111 syntaxTechnologies = new repl111();
        syntaxTechnologies.synt();
        repl111 syntaxStudents  = new repl111();
        syntaxStudents.tech();


    }
}
