/*
 * Copyright (c) 2022 Daniel Szankovich.
 *  Discord: Bricksmaster#7130
 *  Check out my GitHub: https://github.com/Bricksmaster
 */

package at.fhburgenland.einfprog.uebungen;

public class SimpleSimpleCalc {

        public static void main(String[] args)
        {
            try {
                int a = 30, b = 0;
                int c = a/b; // cannot divide by zero
                System.out.println ("Result = " + c);
            }
            catch(ArithmeticException arithmeticException) {
                System.out.println("Do not divide by zero!");
               // System.out.println(arithmeticException.getMessage());
            }
        }
    }
