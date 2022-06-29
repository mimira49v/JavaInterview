package com.syntax.class14;

public class Main5 {
    /*Create  class Student that will have a method getGrade. Your method should accept the score of a student and return a grade:
     score > 90 - A
     score >80 - B
     score >70 - C
     score > 50 - D
     anything else - F
     */

    char getGrade(int score ){
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

    public static void main(String[] args) {

        Main5 task=new Main5();
        System.out.println(task.getGrade(75));
        task.getGrade(0);

    }
}