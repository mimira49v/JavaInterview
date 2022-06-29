package repl92to156;
/*
Complete the Employee.java class:
Include the following class variables:
name(String)
lastName(String)
employeeId(int)
startDate(String)
salary(int)
=========================
Write two constructors:
non-argument constructor
parameterized constructor that will initialize all instance variables
=========================
Create two different objects of the Employee class using both constructors and print the values of the properties inline using a print method.
Output:
null null 0 null 0
Joe Smith 12345 01/01/1970 35000
 */
public class repl146 {
        public static void main(String[] args){
            Emply obj=new Emply();
            obj.printName();

            Emply obj1=new
                    Emply("Joe","Smith",
                    12345,"01/01/1970",35000);

        }
    }
class Emply{

        String name;
        String lastName;
        int employeeID;
        String startDate;
        int salary;

    Emply(){
        }
        void printName(){       // non-argument constructor
            System.out.println(name+" "+lastName+" "+employeeID+" "+startDate+" "+salary);
        }

                                // parameterized constructor
    Emply(String name, String lastName, int employeeID, String startDate, int salary){
            this.name=name;
            this.lastName=lastName;
            this.employeeID=employeeID;
            this.startDate=startDate;
            this.salary=salary;

            System.out.println(name+" "+lastName+" "+employeeID+" "+startDate+" "+salary);
        }
    }

