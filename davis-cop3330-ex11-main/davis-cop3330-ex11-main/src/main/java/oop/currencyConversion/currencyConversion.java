/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Xaria Davis
 */

package oop.currencyConversion;
import java.util.Scanner;

public class currencyConversion {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        currencyConversion myApp = new currencyConversion();

        System.out.print("How many euros are you exchanging? ");
        double c_from = myObj.nextDouble();

        System.out.print("What is the exchange rate? ");
        double rate_from = myObj.nextDouble();

        double c_to = myApp.currencyConversionFunction(c_from, rate_from);
        System.out.println(String.format("%.0f euros at an exchange rate of %.4f is \n%.2f U.S. dollars.", c_from, rate_from, c_to));
    }

    public double currencyConversionFunction(double rate_from, double c_from){
        double c_to = c_from * rate_from;
        return c_to;
    }
}
