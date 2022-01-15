/*
 * Copyright (c) 2022 Daniel Szankovich.
 *  Discord: Bricksmaster#7130
 *  Check out my GitHub: https://github.com/Bricksmaster
 */

package at.fhburgenland.einfprog.uebungen;

import java.util.Scanner;

public class SimplePlusWithException {
    public static void main(String[] args) {

        double result;
        double firstCalcNumber = 0;
        double secondCalcNumber = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        String firstNumber = scanner.nextLine();

        System.out.print("Enter second number: ");
        String secondNumber = scanner.nextLine();

        try{
           firstCalcNumber = Double.parseDouble(firstNumber);
           secondCalcNumber = Double.parseDouble(secondNumber);
        }
        catch (NumberFormatException exception){
            System.out.println("Do not enter a letter!");
            System.out.println(exception.getMessage());
        }

        try{
            result = firstCalcNumber / secondCalcNumber;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException exc){
            System.out.println(exc.getMessage());
        }

    }

}
