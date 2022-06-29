package MethodsHomeWork;

// Create  class Student that will have a method getGrade.
// Your method should accept the score of a student and return a grade:
// score > 90 - A
// score >80 - B
// score >70 - C
// score > 50 - D
// anything else - F

public class Student {

    char student(int score){
        if(score>90){
            return'A';
        }else if(score>80 && score<=90) {
            return'B';
        }else if(score>70 && score<=80){
            return 'C';
        }else {
            return 'F';
        }
    }
    public static void main(String[] args){
    Student grade=new Student();
    System.out.println(grade.student(80));
    }
}
