/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Xaria Davis
 */


package oop.MSTaxCalc;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        final double WisconsinTax = 0.05;
        final double EClaireTax = 0.005;
        final double DunnTax = 0.004;
        final double IllinoisTax = 0.08;

        System.out.print("What is the order amount? ");
        double orderAmount = myObj.nextDouble();
        System.out.print("What state do you live in? ");
        String state = myObj.next().toLowerCase(Locale.ROOT);
        myObj.nextLine();

        if(state.equals("wisconsin")){
            System.out.print("What county do you live in? ");
            String county = myObj.nextLine().toLowerCase(Locale.ROOT);
            if(county.equals("eau claire")){
                double taxChargedEau = taxAmountCalc(orderAmount, WisconsinTax) + taxAmountCalc(orderAmount, EClaireTax);
                double totalEau = totalCalculation(orderAmount, taxChargedEau);
                System.out.print(String.format("The tax is $%.2f.\nThe total is $%.2f.", taxChargedEau, totalEau));
            } else if(county.equals("dunn")){
                double taxChargedDunn = taxAmountCalc(orderAmount, WisconsinTax) + taxAmountCalc(orderAmount, DunnTax);
                double totalDunn = totalCalculation(orderAmount, taxChargedDunn);
                System.out.print(String.format("The tax is $%.2f.\nThe total is $%.2f.", taxChargedDunn, totalDunn));
            } else{
                double taxChargedOther = taxAmountCalc(orderAmount, WisconsinTax);
                double totalOther = totalCalculation(orderAmount, taxChargedOther);
                System.out.print(String.format("The tax is $%.2f.\nThe total is $%.2f.", taxChargedOther, totalOther));
            }
        } else if(state.equals("illinois")){
            double taxChargedIllinois = taxAmountCalc(orderAmount, IllinoisTax);
            double totalIllinois = totalCalculation(orderAmount, taxChargedIllinois);
            System.out.print(String.format("The tax is $%.2f.\nThe total is $%.2f.", taxChargedIllinois, totalIllinois));
        } else {
            System.out.println(String.format("The total is $%.2f.", orderAmount));
        }

    }

    public static double taxAmountCalc(double orderAmount, double taxAmount){
        double taxCharged = orderAmount * taxAmount;
        return taxCharged;
    }

    public static double totalCalculation(double orderAmount, double taxAmount){
        double total = orderAmount + taxAmount;
        return total;
    }
}
