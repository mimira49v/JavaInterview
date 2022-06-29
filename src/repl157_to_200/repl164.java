package repl157_to_200;

/*
Create a method hello() in parent class that will print "method in Parent class"
then override that method is 3 Subclasses
implementing login to print "method in Child1/Child2/Child3 class"
In Main Class create 3 object of the child classes and store in into an array and call method hello():

Expected Output:

method in Child1 class
method in Child2 class
method in Child3 class
 */
class ParentXX{
    void hello(){
        System.out.println("method in Parent class");
    }
}
class ChildX_1 extends ParentXX{
    void hello(){
        System.out.println("method in Child1/Child2/Child3 class");
    }
}
class ChildX_2 extends ParentXX{
    void hello(){
        System.out.println("method in Child1/Child2/Child3 class");
    }
}
class ChildX_3 extends ParentXX{
    void hello(){
        System.out.println("method in Child1/Child2/Child3 class");
    }
}
public class repl164 {
    public static void main(String[] args) {

    ParentXX[] obj={new ChildX_1(),new ChildX_2(),new ChildX_3()};
        for (ParentXX b:obj) {
            b.hello();

        }

    }
}
