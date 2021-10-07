/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Xaria Davis
 */


package oop.madLib;

import java.util.Scanner;

public class madLib {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter a noun: ");
        String noun = myObj.nextLine();

        System.out.print("Enter a verb: ");
        String verb = myObj.nextLine();

        System.out.print("Enter an adjective: ");
        String adj = myObj.nextLine();

        System.out.print("Enter an adverb: ");
        String adverb = myObj.nextLine();

        String finalOutput = String.format("Do you %s your %s %s %s? That's hilarious!", verb, adj, noun, adverb);
        System.out.println(finalOutput);
    }
}