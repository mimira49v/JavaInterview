package com.syntax.class24;

abstract class File{         // creating task File


   abstract void open();     // creating behaviours
   void edit(){
       System.out.println("Editing a class");
   }
   void close(){
       System.out.println("closing the file");
   }
}


class JavaFile extends File{  // creating 3 subclasses
    @Override
    void open(){System.out.println("Use intellij to open java files");}         // providing implementation
}
class WordFile extends File{
    @Override
    void open(){System.out.println("Use microsoft word to open this file");}  // providing implementation
}
class PdfFile extends File{
    @Override
    void open(){System.out.println("Use adobe reader to open the file");}  // providing implementation
}
abstract class TaskFile {

    public static void main(String[] args) {
        /*
        if a method is not present inside the parent class we can't call that method using polymorphism

        Object[] files =(new JavaFile(),new WordFile(),new );}

        Object[0]*/

        File[] files = {new JavaFile(), new PdfFile(), new WordFile()};
        for (int i = 0; i < files.length; i++) {
            files[i].open();
            files[i].edit();
            files[i].close();
        }

/*
  Create a class File that will have the following behaviors: open, edit, close.
  Edit and close are implemented method while open is an abstract.
  Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
  Example: to open .java file we need notepad++ or sublime text, to open .doc file
  we need Microsoft Word to be installed etc
   */
    }
}