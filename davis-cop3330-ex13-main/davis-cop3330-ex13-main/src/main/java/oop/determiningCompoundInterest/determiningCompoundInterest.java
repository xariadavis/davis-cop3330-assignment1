/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Xaria Davis
 */


package oop.determiningCompoundInterest;
import java.util.Scanner;
import java.lang.Math;

public class determiningCompoundInterest {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        System.out.print("What is the principal amount? ");
        int principal = myObj.nextInt();

        System.out.print("What is the rate? ");
        double userRate = myObj.nextDouble();
        double rate = userRate / 100;

        System.out.print("What is the number of years? ");
        int numYears = myObj.nextInt();

        System.out.print("What is the number of times the interest is compound per year? ");
        int numCompound = myObj.nextInt();

        double amount = calcCompoundInterest(principal, rate, numYears, numCompound);
        System.out.println(String.format("$%d invested at %.1f%% for %d years compounded %d times per year is $%.2f.", principal, userRate, numYears, numCompound, amount));
    }

    public static double calcCompoundInterest(int principal, double rate, int numYears, int numCompound){
        double base = (1 + (rate/numCompound));
        int exponent = numCompound * numYears;
        double amount = Math.pow(base, exponent) * principal;
        return amount;
    }

}
