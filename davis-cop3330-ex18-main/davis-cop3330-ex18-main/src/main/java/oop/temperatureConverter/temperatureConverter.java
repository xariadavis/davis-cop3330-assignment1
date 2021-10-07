/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Xaria Davis
 */


package oop.temperatureConverter;
import java.util.Locale;
import java.util.Scanner;

public class temperatureConverter {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        System.out.print("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.\nYour choice: ");
        String userChoice = myObj.next().toUpperCase(Locale.ROOT);

        if(userChoice.equals("C")){
            System.out.print("Please enter the temperature in Fahrenheit: ");
            int startingTempFahren = myObj.nextInt();
            int endingTempCelsius = FahrenToCelsius(startingTempFahren);
            System.out.println(String.format("The temperature in Celsius is %d.", endingTempCelsius));
        } else if(userChoice.equals("F")) {
            System.out.print("Please enter the temperature in Celsius: ");
            int startingTempCelsius = myObj.nextInt();
            int endingTempFahren = CelsiusToFahren(startingTempCelsius);
            System.out.println(String.format("The temperature in Fahrenheit is %d.", endingTempFahren));
        }
    }

    public static int FahrenToCelsius(int startingTemp){
        int celsius = (startingTemp - 32) * 5 / 9;
        return celsius;
    }

    public static int CelsiusToFahren(int startingTemp){
        int fahrenheit = ((startingTemp * 9) / 5) + 32;
        return fahrenheit;
    }
}