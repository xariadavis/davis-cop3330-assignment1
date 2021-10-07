/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Xaria Davis
 */


package oop.paintCalculator;
import  java.util.Scanner;

public class paintCalculator {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        final double coveragePerGallon = 350;

        System.out.print("What is the length of the room in square feet? ");
        int length = myObj.nextInt();

        System.out.print("What is the width of the room in square feet? ");
        double width = myObj.nextInt();

        double totalSquareFT = length * width;
        double tempGallonsNeeded = totalSquareFT / coveragePerGallon;
        int gallonsNeeded = (int) Math.ceil(tempGallonsNeeded);

        System.out.println("You will need to purchase " + gallonsNeeded + " gallons of paint to cover " + (int)totalSquareFT + " square feet.");
    }
}
