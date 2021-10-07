/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Xaria Davis
 */


package oop.selfCheckout;

public class math {
    public static double subtotalFunction(int item1Price, int item1Quantity, int item2Price, int item2Quantity, int item3Price, int item3Quantity){
        int totalItem1 = item1Price * item1Quantity;
        int totalItem2 = item2Price * item2Quantity;
        int totalItem3 = item3Price * item3Quantity;
        double subtotal = totalItem1 + totalItem2 + totalItem3;
        return subtotal;
    }

    public static double taxFunction(double subtotal){
        double taxConstant = 0.055;
        double tax = subtotal * taxConstant;
        return tax;
    }

    public static double totalFunction(double subtotal, double tax){
        double total = subtotal + tax;
        return total;
    }
}
