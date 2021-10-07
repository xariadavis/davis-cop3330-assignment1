/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Xaria Davis
 */

package oop.printingQuotes;

import java.util.Scanner;

public class printingQuotes {
    public static void main(String[] args) {
        Scanner quoteInput = new Scanner(System.in);
        System.out.print("What is the quote? ");
        String quote = quoteInput.nextLine();

        System.out.print("Who said it? ");
        String author = quoteInput.nextLine();

        System.out.println(author + " says, " + "\"" + quote + "\"");
    }
}