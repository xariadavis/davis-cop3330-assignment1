/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Xaria Davis
 */


package oop.pizzaParty;

public class math {
    public static int slicePerPersonFunction(int numPeople, int totalSlices) {
        int slicePerPerson = totalSlices/numPeople;
        return slicePerPerson;
    }

    public static int numRemainingFunction(int numPeople, int totalSlices) {
        int numRemaining = totalSlices % numPeople;
        return numRemaining;
    }

    public static int totalSlicesFunction(int numPizzas, int slicesPerPizza) {
        int totalSlices = numPizzas * slicesPerPizza;
        return totalSlices;
    }

}
