package repl157_to_200;

/*
Create Class EncapsulationDemo
create two variable as shown below.
private String empName=John;
private int empAge=30;
Create only getters methods for each variable.
Print the values of each variable as shown below.
Expected Output:
Employee Name: John
Employee Age: 30
 */
class EncapsulationDemo_1{
    private String empName="John";
    private int empAge=30;

    public String getName() {
        return empName;
    }
    public int getEmpAge() {
        return empAge;
    }
}
public class repl180 {
    public static void main(String[] args) {
        EncapsulationDemo_1 obj = new EncapsulationDemo_1();
        System.out.println("Employee Name: "+obj.getName());
        System.out.println("Employee Name: "+obj.getEmpAge());
    }
}
