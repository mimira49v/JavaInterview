package repl157_to_200;
/*
Create a class Animal in which define instance variable type, constructor that will initialize instance variables and 2 methods eat and sleep.
Create a subclass Cat in which override method sleep
Create 3 Kitten subclasses of a Cat class and override method eat
for 1 kitten - eats milk
for 2 kitten - eats snack
for 3 kitten - eats everything
In main method create object of Cat class and all 3 kittens classes and store into an array of Animals. Call available methods:
Expected Output:
Cat eats
Cat sleeps a lot
kitten1 eats milk
kitten1 sleeps a lot
kitten2 eats snacks
kitten2 sleeps a lot
kitten3 eats everything
kitten3 sleeps a lot
 */

abstract class animal {
    String type;
    public String animal(String str) {
        this.type = type;
        return str;
    }
    abstract void sleep();
    abstract void eat2();
}
class cat extends animal {
    @Override void sleep(){System.out.println("Cat sleeps a lot");}
    @Override void eat2(){System.out.println("Cat eats");}}
class kitten1 extends cat{
    void eat2(){System.out.println("kitten eats milk");}
    void sleep(){System.out.println("kitten1 sleeps a lot");}
}
class kitten2 extends cat{
    void eat2(){System.out.println("kitten eats snack");}
    void sleep(){System.out.println("kitten2 sleeps a lot");}
}
class kitten3 extends cat{
    void eat2(){System.out.println("kitten eats everything");}
    void sleep(){System.out.println("kitten3 sleeps a lot");}
}
class repl166 {
    public static void main(String[] args) {
        cat catX = new cat();
        catX.eat2();
        catX.sleep();
        animal[] Animals = {new kitten1(), new kitten2(), new kitten3()};
        for (animal b : Animals) {
            b.eat2();
            b.sleep();
        }
    }
}


