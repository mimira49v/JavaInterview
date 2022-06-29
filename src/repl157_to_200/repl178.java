package repl157_to_200;
/*
Create Class EncapsulationDemo
create two variable as shown below.
private String empName;
private int empAge;
Create the getter/setter methods for each variable.
In Main Class and main method.
Using setter methods assign the values as "John" and "30"
Using getter methods print the values as below outputs.
Expected Output:
Employee Name: John
Employee Age: 30
 */
class EncapsulationDemo{

    private String empName;
    private int empAge;

    public void empName(String empName){
        this.empName=empName;
        System.out.println("Employee Name: "+this.empName);
    }
    public void empAge(int empAge){
        this.empAge=empAge;
        System.out.println("Employee Age : "+this.empAge);
    }
}
public class repl178 extends EncapsulationDemo {
    public static void main(String[] args) {
        EncapsulationDemo encapsulationDemo = new EncapsulationDemo();
        encapsulationDemo.empName("John");
        encapsulationDemo.empAge(30);
    }
}
