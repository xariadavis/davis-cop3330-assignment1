/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Xaria Davis
 */


package oop.passwordValidation;
import java.util.Scanner;

public class passwordValidation {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        // creating username and password
        System.out.print("Create a username: ");
        String username = myObj.nextLine();
        System.out.print("Create a password: ");
        String password = myObj.nextLine();
        System.out.println("----------------------------");

        // login attempt
        System.out.print("What is the password? ");
        String passwordEntry = myObj.nextLine();

        if(passwordEntry.equals(password)){
            System.out.println("Welcome!");
        } else{
            System.out.println("I don't know you.");
        }
    }

}
