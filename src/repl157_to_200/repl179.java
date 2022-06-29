package repl157_to_200;
/*
Create Class EncapsulationDemo that will have 2 variables empName and empAge; Create the getter/setter methods for each variable.
In Main Class and main method
Using setter methods assign the values as "Mario" and "32"
Using getter methods print the values as below outputs.
Expected Output:
Employee Name: Mario
Employee Age: 32
 */
class EncapsulationDemo_2 {
    String empName;
    int empAge;

    public void empName(String empName){
        this.empName=empName;
        System.out.println("Employee Name: "+this.empName);
    }
    public void empAge(int empAge){
        this.empAge=empAge;
        System.out.println("Employee Age: "+empAge);
    }
}
public class repl179 {
    public static void main(String[] args) {
        EncapsulationDemo_2 encapsulationDemo = new EncapsulationDemo_2();
        encapsulationDemo.empName("Mario");
        encapsulationDemo.empAge(32);
    }

}
