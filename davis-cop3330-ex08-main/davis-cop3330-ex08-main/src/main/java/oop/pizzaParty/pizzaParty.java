/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Xaria Davis
 */


package oop.pizzaParty;

import java.util.Scanner;

public class pizzaParty {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("How many people? ");
        int numPeople = myObj.nextInt();

        System.out.print("How many pizzas do you have? ");
        int numPizzas = myObj.nextInt();

        System.out.print("How many slices per pizza? ");
        int slicesPerPizza = myObj.nextInt();

        int totalSlices = math.totalSlicesFunction(numPizzas, slicesPerPizza);
        System.out.println(String.format("%d people with %d pizzas (%d slices)", numPeople, numPizzas, totalSlices));

        int slicePerPerson = math.slicePerPersonFunction(numPeople, totalSlices);
        int numRemaining = math.numRemainingFunction(numPeople, totalSlices);
        System.out.println(String.format("Each person gets %d pieces of pizza.", slicePerPerson));
        System.out.println(String.format("There are %d leftover pieces.", numRemaining));
    }
}
