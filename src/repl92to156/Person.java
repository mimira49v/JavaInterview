package repl92to156;

class Person {
    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
    String name;
    String lastName;
    int age;
}
class Employee extends Person {
    int salary;
    public Employee(String name, String lastName, int age, int salary) {
        super(name, lastName, age);
        this.salary = salary;
    }

    void printEmployee () {
        System.out.println(name +" " + lastName + " " + age +" "+  salary);
    }
}
class Student extends Person {
    int grade;
    public Student(String name, String lastName, int age, int grade) {
        super(name, lastName, age);
        this.grade = grade;
    }
    void printStudent () {
        System.out.println(name +" " + lastName + " " + age +" "+  grade);
    }
}
class Retiree extends Person {
    String seniorActivity;
    public Retiree(String name, String lastName, int age, String seniorActivity) {
        super(name, lastName, age);
        this.seniorActivity = seniorActivity;
    }
    void printSenior () {
        System.out.println(name +" " + lastName + " " + age +" "+  seniorActivity);
    }
}
class Main {
    public static void main (String [] agrs ) {
        Employee emp = new Employee("Joe", "Smith", 35, 35000);
        emp.printEmployee();
        Student st = new Student ("Adam", "Smith", 15, 10);
        st.printStudent();
        Retiree ret = new Retiree ("Frank", "Smith", 15, "tour");
        ret.printSenior();
    }
}