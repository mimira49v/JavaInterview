package repl92to156;
/*
For you to do:

Declare 3 instance variables to hold:

name of the country
capital
population size
Create a method to display values of instance variables

Create 2 Object, assign values to instance variables, execute method display;

Expected Output:

The capital of the USA is Washington DC and population is 330000000
The capital of Kazakhstan is Astana and population is 18500000
 */
public class repl122 {
    String nameOfTheCountry;
    String capital;
    double populationSize;

    public static void main(String[] args) {
        repl122 repl122 = new repl122();
        repl122.nameOfTheCountry ="USA";
        repl122.capital="Washington DC";
        repl122.populationSize=330000000;
        System.out.println("The capital of the "+
                repl122.nameOfTheCountry+
                    " is "+repl122.capital+
                        " and population is "+repl122.populationSize);

        repl122 repl1221=new repl122();
        repl1221.nameOfTheCountry="Kazakhstan";
        repl1221.capital="Astana";
        repl1221.populationSize=18500000;
        System.out.println("The capital of the "+
                repl1221.nameOfTheCountry+
                " is "+repl1221.capital+
                " and population is "+repl1221.populationSize);

    }
}