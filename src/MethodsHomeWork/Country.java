package MethodsHomeWork;

public class Country {

    // Create a method that will say Hello in different language
    // based on the country that will passed when method is executed.

    String country;

    void spain(){System.out.println     (country  +": hola");}
    void france(){System.out.println    (country  +": Bonjour");}
    void us(){System.out.println        (country  +": hello");}
    void mexico(){System.out.println    (country  +": que passa cabron");}

    public static void main(String[] args){

        Country language=new Country();
        language.country="spain";
        language.spain();
        language.country="france";
        language.france();
        language.country="us";
        language.us();
        language.country="mexico";
        language.mexico();
    }
}
