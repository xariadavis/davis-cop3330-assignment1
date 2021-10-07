/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Xaria Davis
 */

package oop.simpleMath;

import java.util.Scanner;

public class simpleMath {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("What is the first number? ");
        int firstNum = myObj.nextInt();

        System.out.print("What is the second number? ");
        int secondNum = myObj.nextInt();

        String sumOutput = String.format("%d + %d = %d", firstNum, secondNum, sum(firstNum, secondNum));
        String differenceOutput = String.format("%d - %d = %d", firstNum, secondNum, difference(firstNum, secondNum));
        String productOutput = String.format("%d * %d = %d", firstNum, secondNum, product(firstNum, secondNum));
        String quotientOutput = String.format("%d / %d = %d", firstNum, secondNum, quotient(firstNum, secondNum));
        System.out.println(sumOutput + "\n" + differenceOutput + "\n" + productOutput + "\n" + quotientOutput);
    }

    public static int sum(int firstNum, int secondNum) {
        int sum = firstNum + secondNum;
        return sum;
    }

    public static int difference(int firstNum, int secondNum) {
        int difference = firstNum - secondNum;
        return difference;
    }

    public static int product(int firstNum, int secondNum) {
        int product = firstNum * secondNum;
        return product;
    }

    public static int quotient(int firstNum, int secondNum) {
        int quotient = firstNum / secondNum;
        return quotient;
    }
}