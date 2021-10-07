/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Xaria Davis
 */

package oop.areaOfARectangularRoom;

import java.text.DecimalFormat;
import java.util.Scanner;

public class areaOfARectangularRoom {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("What is the length of the room in feet? ");
        int length = myObj.nextInt();

        System.out.print("What is the width of the room in feet? ");
        int width = myObj.nextInt();

        System.out.println("You entered the dimensions of " + length + " feet by " + width + " feet. \nThe area is");

        int areaFT = length * width;
        System.out.println(areaFT + " square feet");

        final double conversionFactor = 0.09290304;
        double areaM = areaFT * conversionFactor;
        DecimalFormat df = new DecimalFormat("#.000");
        float number = Float.valueOf(df.format(areaM));
        System.out.println(number + " square meters");
    }
}
