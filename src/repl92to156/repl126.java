package repl92to156;
/*
For you to do:

Create a variable that will hold the count of all instances of the Main class

Create 3 Object of the class and print value of the count variable;

Expected Output:

3
 */
public class repl126 {
    //variable to keep track
    private static int count;
    public repl126(){
        count++;
    }
    public static void main(String[] args){
        //creating objects
        repl126  ob1 = new repl126();
        repl126  ob2 = new repl126();
        repl126  ob3 = new repl126();
        // prints number of objects


        System.out.println(repl126.count);


    }
}
