package MethodsHomeWork;

import org.jcp.xml.dsig.internal.SignerOutputStream;

import java.util.Scanner;

public class usserPass {

    /*Accept username, password and confirm password from a user and check following requirements:
    Username and Password cannot be  empty, if so? message=” Username and Password cannot be empty”.
    Password should be minimum 8 characters, if less ? message=” Password is too short”.
    Password cannot contain username if so, message=” Password cannot contain username”.
    Password should match confirmed password, if not  ? message=“Passwords do not match”.
    Only after all requirements met ? message “Your username and password has been created”
     */


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("username :");
        String username = scan.nextLine();
        System.out.println("password :");
        String password = scan.nextLine();

        if (username.isEmpty() || password.isEmpty()) {
            System.out.println("Username and Password cannot be empty!");
                 } else if (password.length() < 8) {
                      System.out.println("Too short!");
                        } else {
                             System.out.println("confirm password");
                        }
        String confirm = scan.nextLine();

         if (!password.equals(confirm)) {
                System.out.println("invalid password");
                 }else {
                     System.out.println("successfully created username and password");
                }


        }
    }