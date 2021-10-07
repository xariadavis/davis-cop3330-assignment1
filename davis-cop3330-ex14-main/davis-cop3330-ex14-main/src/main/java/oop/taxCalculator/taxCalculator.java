/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Xaria Davis
 */


package oop.taxCalculator;
import java.util.Scanner;

public class taxCalculator {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        final double WItax = 0.055;

        System.out.print("What is the order amount? ");
        double orderAmount = myObj.nextDouble();

        System.out.print("What is the state? ");
        Scanner stateInput = new Scanner(System.in);
        String state = stateInput.nextLine();

        if(state.equals("WI")){
            double taxAmount = taxCalculation(orderAmount, WItax);
            double totalAmount = totalAmountCalculation(taxAmount, orderAmount);
            System.out.println(String.format("The subtotal is $%.2f.\nThe tax is $%.2f.\nThe total is $%.2f.", orderAmount, taxAmount, totalAmount));
            return;
        }

        System.out.println(String.format("The total is $%.2f.", orderAmount));
    }

    public static double taxCalculation(double orderAmount, double WItax){
        double taxAmount = orderAmount * WItax;
        return taxAmount;
    }

    public static double totalAmountCalculation(double taxAmount, double orderAmount){
        double totalAmount = taxAmount + orderAmount;
        return totalAmount;
    }
}