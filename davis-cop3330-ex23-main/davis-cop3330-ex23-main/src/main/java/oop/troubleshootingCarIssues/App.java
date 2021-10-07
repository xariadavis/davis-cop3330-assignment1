/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Xaria Davis
 */

package oop.troubleshootingCarIssues;

import java.util.Locale;
import java.util.Scanner;

public class App {
    static Scanner myObj = new Scanner(System.in);
    public static void main( String[] args ) {
        App myApp = new App();
        System.out.print("Is the car silent when you turn the key? ");
        if(myApp.response()){
            System.out.print("Are the car battery terminals corroded? ");
            if(myApp.response()){
                System.out.println("Clean the terminals and try starting again. ");
            } else {
                // not stated in uml but stated in sample output
                System.out.println("The battery cables may be damaged.");
                System.out.println("Replace cables and try again.");
            }
        } else{
            System.out.print("Does the car make a slicking noise? ");
            if(myApp.response()){
                System.out.println("Replace the battery. ");
            } else {
                System.out.print("Does the car crank up but fail to start? ");
                if(myApp.response()){
                    System.out.println("Check spark plug connections.");
                } else {
                    System.out.print("Does the engine start and then die? ");
                    if(myApp.response()){
                        System.out.print("Does your car have fuel injection? ");
                        if(myApp.response()){
                            System.out.println("Get it in for service.");
                        } else{
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }
                    } else{
                        System.out.println("This should not be possible.");
                    }
                }
            }
        }
    }

    private boolean response(){
        String response = myObj.nextLine().toLowerCase(Locale.ROOT);
        if(response.equals("y") || response.equals("yes")){
            return true;
        } else
            return false;
    }

}
