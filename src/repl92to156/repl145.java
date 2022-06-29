package repl92to156;
/*
Complete the Dog.java class:
Create following class variables.

dogName

dogWeight

static dogBreed=Mutt;

For all methods and variables use proper naming convention.

Create constructor to initialize instance variables

In Main class Create 2 Objets of a Dog class and using each object reference variable print details of objects.
Expected Output:

Tarzan Mutt 50.0
Lucy Mutt 10.0
 */
class DogTester {
    public static void main(String[] args) {

        Dog dog = new Dog("Tarzan","Mutt",50.0);
        dog.printInfo();
        Dog dog1=new Dog("Lucy","Mutt",10.0);
        dog1.printInfo();
    }
}
class Dog{
        String dogName;
        double dogWeight;
        static String dogBread="Mutt";

public Dog (String dogName,String dogBread,double dogWeight){
    this.dogName=dogName;
    dogBread="Mutt";
    this.dogWeight=dogWeight;

    }
  void printInfo(){
        System.out.println(this.dogName+" "+dogBread+" "+this.dogWeight);
    }
}
