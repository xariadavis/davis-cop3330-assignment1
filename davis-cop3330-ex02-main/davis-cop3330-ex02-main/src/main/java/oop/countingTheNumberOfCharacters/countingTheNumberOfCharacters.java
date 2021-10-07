/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Xaria Davis
 */

package oop.countingTheNumberOfCharacters;

import java.util.Scanner;

public class countingTheNumberOfCharacters {
    public static void main(String[] args) {

        // takes string input
        Scanner stringInput = new Scanner(System.in);
        System.out.print("What is the input string? ");
        String string = stringInput.nextLine();

        // calculate the number of characters in strings
        int stringLength = string.length();
        System.out.println(string + " has " + stringLength + " characters.");
    }
}
