package TasksFromAshgar.ExceptionsHw;

import java.io.*;

public class Task2 {
    // Create a static method that will return a List of Exceptions.
    // Inside your method create objects of 4 exception classes using
    // try and catch blocks and store them inside your list.
    // Call your method inside main and print name and details of all Exceptions objects
    static void arithmeticalException(int a, int b) {
        try {
            System.out.println(a / b);
                }catch (ArithmeticException e) {
                    System.out.println("Number cannot / by zero!");}}
        static void nullPointerException(){
            try{
                String str = null;
                str.length();
                }   catch (NullPointerException exception){
                        System.out.println("NullPointerException occured");}}
        static void negativeArraySizeException(){
            try{
                int[] arr = new int[-1];
                }   catch (NegativeArraySizeException exception){
                        System.out.println("NegativeArraySizeException occured");}}
        static void FileNotFoundException(){
            try{
                String fileName = "";
                BufferedReader file = null;
                    file = new BufferedReader(new FileReader(new File(fileName)));
                        } catch (FileNotFoundException e){
                            System.out.println("No such file or directory");}}
        static void IndexOutOfBoundsException(){
            try{
                String [] strArr = new String[2];
                strArr[5]="Error";
                }   catch (IndexOutOfBoundsException e){
                        System.out.println("IndexOutOfBoundsException occurred");}}
    public static void main(String[] args) throws IOException {
        arithmeticalException(10,0);
        nullPointerException();
        negativeArraySizeException();
        FileNotFoundException();
        IndexOutOfBoundsException();
    }
}
