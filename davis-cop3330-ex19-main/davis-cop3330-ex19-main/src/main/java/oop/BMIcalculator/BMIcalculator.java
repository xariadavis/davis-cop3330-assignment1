/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Xaria Davis
 */


package oop.BMIcalculator;
import java.util.Scanner;

public class BMIcalculator {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        System.out.print("What is your weight in pounds? ");
        double weight = inputNum();

        System.out.print("What is your height in inches? ");
        double height = inputNum();

        double BMI = calcBMI(weight, height);
        System.out.println(String.format("Your BMI is %.1f.", BMI));
        if(BMI > 18.5 && BMI < 25){
            System.out.println("You are within the ideal weight range.");
        } else if(BMI < 18.5){
            System.out.println("You are underweight. You should see a doctor.");
        } else if(BMI > 25){
            System.out.println("You are overweight. You should see a doctor.");
        }

    }

    public static double calcBMI(double weight, double height){
        double bmi = (weight / (height * height)) * 703;
        return bmi;
    }

    public static double inputNum() {
        Scanner myObj = new Scanner(System.in);
        while (!myObj.hasNextDouble()){
            System.out.print("Please enter and integer: ");
            myObj.nextLine();
        }
        return myObj.nextDouble();
    }
}
