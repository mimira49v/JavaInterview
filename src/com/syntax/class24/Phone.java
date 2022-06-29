package com.syntax.class24;

public abstract class Phone {
    void makePhoneCall(){
        System.out.println("Making a phone call");
    }
    void sendText(){
        System.out.println("Sending a text");
    }

    // no, body to the method
    abstract void displayPicture();
        abstract void unlockPhone();
}


abstract class Iphone extends Phone{
    @Override
    void displayPicture(){
        System.out.println("Use the photo app to display the pics");
    }
}
class Samsung extends Phone{
    @Override
    void displayPicture(){
        System.out.println("Use gallery to display pics");
    }
    @Override
    void unlockPhone(){
        System.out.println("Face and finger print");
    }
}
