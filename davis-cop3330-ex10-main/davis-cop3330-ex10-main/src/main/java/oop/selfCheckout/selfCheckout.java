/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Xaria Davis
 */


package oop.selfCheckout;
import java.util.Scanner;

public class selfCheckout {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        // input
        System.out.print("Enter the price of item 1: ");
        int item1Price = myObj.nextInt();
        System.out.print("Enter the quantity of item 1: ");
        int item1Quantity = myObj.nextInt();

        System.out.print("Enter the price of item 2: ");
        int item2Price = myObj.nextInt();
        System.out.print("Enter the quantity of item 2: ");
        int item2Quantity = myObj.nextInt();

        System.out.print("Enter the price of item 3: ");
        int item3Price = myObj.nextInt();
        System.out.print("Enter the quantity of item 3: ");
        int item3Quantity = myObj.nextInt();


        // math operations
        double subtotal = math.subtotalFunction(item1Price, item1Quantity, item2Price, item2Quantity, item3Price, item3Quantity);
        double tax = math.taxFunction(subtotal);
        double total = math.totalFunction(subtotal, tax);

        //output
        System.out.println(String.format("Subtotal: $%.2f", subtotal));
        System.out.println(String.format("Tax: $%.2f", tax));
        System.out.println(String.format("Total: $%.2f", total));
    }
}