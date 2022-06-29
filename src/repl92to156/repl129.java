package repl92to156;
/*
For you to do:

Declare two static variables to hold

country name
continent
Create a method to display the value of static variables in the following format:

____ located on ____ continent

In the main method assign values to a static variable and execute method display

Expected Output:

Morocco located on Africa continent
 */
public class repl129 {
    static String countryName;
    static String continent;
    void display(){
        System.out.println(countryName+" located on "+continent);
    }
    public static void main(String[] args) {
        repl129 repl129= new repl129();
        repl129.countryName="Marocco";
        repl129.continent="Africa continent";
        repl129.display();
    }

}
