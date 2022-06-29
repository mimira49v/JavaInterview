package repl157_to_200;
/*
Create the Person class with the following:
Class Variables

firstname
lastname
birthmonth
birthday
birthyear
String ssn
Constructor

The main constructor should take in all values and assign them to their respective private class variables

Methods

Create a public getters to access all the variables.

Create a public method called formatBirthday, which will return a String composed of their birthday in mm/dd/yyyy format. For example,
if birthmonth=3, birthday=22, birthyear=2000, it should return the String "3/22/2000"

in Main Class.

Instantiate and object of Person and provide values. follows below outputs for values.

using getter and method print them separately.

Note: Read carefully the steps.

Expected Output:

John
Doe
10/25/1900
123-45-6789
 */
class Person{
    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getBirthmonth() {
        return birthmonth;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getBirthyear() {
        return birthyear;
    }

    public String getSsn() {
        return ssn;
    }

    public String formatBirthday(){
        return birthmonth+"/"+birthday+"/"+birthyear;
    }


   private String firstname;
   private String lastname;
   private String birthmonth;
   private String birthday;
   private String birthyear;
   private String ssn;
public Person(){
    firstname="John";
    lastname="Doe";
    birthmonth="10";
    birthday="25";
    birthyear="1900";
    ssn="123-45-6789";

}
}
public class repl182 {
    public static void main(String[] args) {
        Person obj = new Person();
        System.out.println(obj.getFirstname());
        System.out.println(obj.getLastname());
        System.out.println(obj.formatBirthday());
        System.out.println(obj.getSsn());


    }
}
