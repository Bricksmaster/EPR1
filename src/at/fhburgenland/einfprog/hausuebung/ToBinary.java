/*
 * Copyright (c) 2022 Daniel Szankovich.
 *  Discord: Bricksmaster#7130
 *  Check out my GitHub: https://github.com/Bricksmaster
 */

package at.fhburgenland.einfprog.hausuebung;

import java.util.Scanner;

public class ToBinary {

    static void toBinary(int number)
    {
        if (number < 0){
            System.out.println();
            System.out.println("Please enter a number > 0!");
            return;
        }

        System.out.println();
        int[] binary = new int[40];
        int index = 0;
        while(number > 0){
            binary[index++] = number%2;
            number = number/2;
        }
        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
        }
    }

    public static void main(String[] args) {
        toBinary(5);
        toBinary(18);
        toBinary(42);
        toBinary(-1);

    }
}

