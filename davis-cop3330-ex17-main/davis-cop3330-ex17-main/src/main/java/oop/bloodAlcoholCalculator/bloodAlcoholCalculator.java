/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Xaria Davis
 */

package oop.bloodAlcoholCalculator;
import java.util.Scanner;

public class bloodAlcoholCalculator {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        bloodAlcoholCalculator myApp = new bloodAlcoholCalculator();

        System.out.print("Enter a 1 if you are male or a 2 if you are female: ");
        double sex = myApp.inputNum();
        double disRatio = myApp.disRatio(sex);

        System.out.print("How many ounces of alcohol did you have? ");
        double amountAlcohol = myApp.inputNum();

        System.out.print("What is your weight, in pounds? ");
        double weight = myApp.inputNum();

        System.out.print("How many hours has it been since your last drink? ");
        double hours = myApp.inputNum();

        double BAC = myApp.BACalculation(disRatio, weight, amountAlcohol, hours);
        System.out.println(String.format("\nYou BAC is %.6f", BAC));

        if(BAC < 0.08) {
            System.out.println("It is legal for you to drive");
        } else{
            System.out.println("It is not legal for you to drive");
        }
    }

    public double BACalculation(double disRatio, double weight, double amountAlcohol, double hours){
        double BAC = (amountAlcohol * 5.14 / weight * disRatio) - 0.015 * hours;
        return BAC;

    }
    public double disRatio(double sex){
        if(sex == 2){
            double disRatio = 0.66;
            return disRatio;
        } if(sex == 1){
            double disRatio = 0.73;
            return disRatio;
        }
        return 0;
    }

    public double inputNum() {
        Scanner myObj = new Scanner(System.in);
        while (!myObj.hasNextDouble()){
            System.out.print("Please enter an integer: ");
            myObj.nextLine();
        }
        return myObj.nextDouble();
    }
}
