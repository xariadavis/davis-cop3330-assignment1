/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Xaria Davis
 */

package oop.numbersToNames;
import java.util.Scanner;

public class App {
    static Scanner myObj = new Scanner(System.in);
    public static void main( String[] args ) {
        App myApp = new App();

        System.out.print("Please enter the number of the month: ");
        int numMonth = myObj.nextInt();

        if(numMonth > 12 || numMonth < 1) {
            System.out.println("Error! Please enter an integer between 1 and 12.");
            return;
        }

        String monthName = myApp.setMonth(numMonth);
        String output = String.format("The name of the month is %s.", monthName);
        System.out.println(output);
    }

    private String setMonth(int numMonth){
        String monthName = null;
        switch(numMonth){
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
        }
        return monthName;
    }

}
