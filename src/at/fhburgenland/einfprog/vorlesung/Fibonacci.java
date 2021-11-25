/*
 * Copyright (c) 2021 Daniel Szankovich.
 *  Discord: Bricksmaster#7130
 *  Check out my GitHub: https://github.com/Bricksmaster
 */

package at.fhburgenland.einfprog.vorlesung;

public class Fibonacci {
    static  void printFibonacciNumbers(int number){
        if (number <= 2){
            System.out.println("Number must be greater than 2!");
            return;
        }

        int fMinus1 = 1;
        int fMinus2 = 1;
        System.out.print("1 1 ");
        for (int i=2; i<number; i++){
            int f = fMinus1 + fMinus2;
            System.out.print(f + " ");
            fMinus2 = fMinus1;
            fMinus1 = f;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printFibonacciNumbers(20);
    }
}
