package ex18;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 justin gesek
 */
import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;
//You’ll often need to determine which part of a program is run based on user input or other events.
//
//Create a program that converts temperatures from Fahrenheit to Celsius or from Celsius to Fahrenheit. Prompt for the starting temperature. The program should prompt for the type of conversion and then perform the conversion.
//
//The formulas are
//
//C = (F − 32) × 5 / 9
//and
//
//F = (C × 9 / 5) + 32
//Example Output
//Press C to convert from Fahrenheit to Celsius.
//Press F to convert from Celsius to Fahrenheit.
//Your choice: C
//Please enter the temperature in Fahrenheit: 32
//The temperature in Celsius is 0.
//
//Constraints
//Ensure that you allow upper or lowercase values for C and F.
//Use as few output statements as possible and avoid repeating output string
public class ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Press C to convert from Fahrenheit to Celsius.\n" +
                "Press F to convert from Celsius to Fahrenheit.\n" +
                "Your choice: ");
        String toScale = scanner.nextLine();
        String fromScale;
        if(toScale.toLowerCase(Locale.ROOT).equals("c"))
        {
            toScale = "Celsius";
            fromScale = "Fahrenheit";
        }
        else
        {
            toScale = "Fahrenheit";
            fromScale = "Celsius";
        }
        System.out.printf("Please enter the temperature in %s: ", fromScale);
        double temp = scanner.nextDouble();
        if(toScale.equals("Celsius"))
        {
            temp = (temp - 32) * 5.0 / 9.0;
        }
        else
        {
            temp = (temp * 9.0 / 5.0) + 32;
        }

        System.out.printf("The temperature in %s is: %.2f.\n", toScale, temp);

    }
}
