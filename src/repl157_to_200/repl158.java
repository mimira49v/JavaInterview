package repl157_to_200;

class Parent {

    String city;
    Parent(String city){
        this.city=city;
    }
    public void display() {
        System.out.println("City name "+city);
    }

}

class Child extends Parent {

    Child(String city) {
        super(city);
        this.display();

    }

}


public class repl158 {
    public static void main(String[] args) {
    Child child = new Child("Fairfax");


    }
}
/*
Super Keyword.
Note: Use separate Classes.
Create Class call Parent.

create a class String variable call city.

create Parent constructor take the String parameter city. include the logic to assign the value of parameter to class variable.

create method with below specification.

access modifier public.

return type void

name display

Write the logic to print the sentence below.

"City name " + the value of class variable.

Create Child Class.

inherit to Parent class.

create Child constructor with one String parameter called city.

call super constructor and pass the parameter.

in Main Class.

Create and object of Child class. pass city name as "Fairfax" and call the display method.

Output.

City name Fairfax
 */