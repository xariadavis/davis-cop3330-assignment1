/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Xaria Davis
 */


package oop.legalDrivingAge;
import java.util.Scanner;

public class legalDrivingAge {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        System.out.print("What is your age? ");
        int age = myObj.nextInt();

        String tooYoung = "You are not old enough to legally drive.";
        String oldEnough = "You are old enough to legally drive.";
        String verdict;

        verdict = (age < 16) ? tooYoung : oldEnough;
        System.out.println(verdict);
    }
}