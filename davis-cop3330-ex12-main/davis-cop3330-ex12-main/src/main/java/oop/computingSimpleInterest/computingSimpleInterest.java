/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Xaria Davis
 */

package oop.computingSimpleInterest;
import java.util.Scanner;

public class computingSimpleInterest {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        int principal = myObj.nextInt();

        System.out.print("Enter the rate of interest: ");
        double temp = myObj.nextDouble();
        double rateOfInterest = temp / 100;

        System.out.print("Enter the number of years: ");
        int years = myObj.nextInt();

        double amount = investmentTotalCalculation(principal, rateOfInterest, years);
        System.out.println("After " + years + " years at " + temp + "%, the investment will be worth $" + (int)amount + ".");
    }

    public static double investmentTotalCalculation(int principal, double rateOfInterest, int years){
        double amount = principal * (1 + (rateOfInterest * years));
        return amount;
    }
}
