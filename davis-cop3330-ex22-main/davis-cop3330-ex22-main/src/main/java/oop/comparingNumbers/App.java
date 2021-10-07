/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Xaria Davis
 */

package oop.comparingNumbers;
import java.util.Scanner;

public class App {
    static Scanner myObj = new Scanner(System.in);
    public static void main( String[] args ) {
        App myApp = new App();

        System.out.print("Enter the first number: ");
        int firstNum = myObj.nextInt();
        System.out.print("Enter the second number: ");
        int secondNum = myObj.nextInt();
        System.out.print("Enter the third number: ");
        int thirdNum = myObj.nextInt();

        if(myApp.checkUnique(firstNum, secondNum, thirdNum)){
            return;
        }

        int largestNum = myApp.findLargestNumber(firstNum, secondNum, thirdNum);

        String output = String.format("The largest number is %d.", largestNum);
        System.out.println(output);

    }

    private int findLargestNumber(int first, int second, int third){
        int largestNumber = 0;
        if(first < second && second > third){
            largestNumber = second;
        } else if(first > second && first > third) {
            largestNumber = first;
        } else if(third > first && third > second){
            largestNumber = third;
        }
        return largestNumber;
    }

    private boolean checkUnique(int firstInput, int secondInput, int thirdInput){
        String checkUniqueOutput;
        if(firstInput == secondInput && firstInput == thirdInput){
            checkUniqueOutput = "All three integers are the same. Please try again with three unique integers.";
            System.out.println(checkUniqueOutput);
        } else if(firstInput == secondInput || firstInput == thirdInput || secondInput == thirdInput){
            checkUniqueOutput = "Two of the integers are the same. Please try again with three unique integers.";
            System.out.println(checkUniqueOutput);
        } else {
            return false;
        }
        return true;
    }
}
