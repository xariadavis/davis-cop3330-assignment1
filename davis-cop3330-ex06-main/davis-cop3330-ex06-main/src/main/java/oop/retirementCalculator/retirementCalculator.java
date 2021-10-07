/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Xaria Davis
 */


package oop.retirementCalculator;

import java.util.Calendar;
import java.util.Scanner;

public class retirementCalculator {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        int year = Calendar.getInstance().get(Calendar.YEAR);

        System.out.print("What is your current age? ");
        int currAge = myObj.nextInt();

        System.out.print("At what age would you like to retire? ");
        int retireAge = myObj.nextInt();

        int timeLeft = timeLeftfun(retireAge, currAge);
        int retirementYear = retirementYearfun(year, retireAge, currAge);
        System.out.println(String.format("You have %d years left until you can retire.", timeLeft));
        System.out.println(String.format("It's %d, so you can retire in %d.", year, retirementYear));

    }

    public static int timeLeftfun(int retireAge, int currAge) {
        int timeLeft = retireAge - currAge;
        return timeLeft;
    }

    public static int retirementYearfun(int year, int retireAge, int currAge) {
        int retirementYear = year + timeLeftfun(retireAge, currAge);
        return retirementYear;
    }
}