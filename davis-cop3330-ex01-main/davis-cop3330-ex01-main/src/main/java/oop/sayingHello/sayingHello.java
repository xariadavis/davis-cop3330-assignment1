/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Xaria Davis
 */


package oop.sayingHello;
import java.util.Scanner;

public class sayingHello {
    public static void main(String[] args) {
        Scanner nameInput = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = nameInput.nextLine();
        String output = "Hello, " + name + ", nice to meet you!";
        System.out.println(output);
    }
}
