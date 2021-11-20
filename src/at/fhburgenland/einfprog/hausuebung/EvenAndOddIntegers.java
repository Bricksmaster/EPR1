/*
 * Copyright (c) 2021 Daniel Szankovich.
 *  Discord: Bricksmaster#7130
 *  Check out my GitHub: https://github.com/Bricksmaster
 */

package at.fhburgenland.einfprog.hausuebung;

import java.util.Arrays;

public class EvenAndOddIntegers {

        static String evenOdd(int[] numbers ){

            String returnfix = "";
            int evenNumberCounter = 0;
            int oddNumberCounter = 0;

            for (int i=0; i<numbers.length; i++){
                if (numbers[i] == 2 || numbers[i] == 4 || numbers[i] == 6 ||numbers[i] == 8 || numbers[i] == 10 ){
                    evenNumberCounter+=1;
                }
                else{
                    oddNumberCounter+=1;
                }
            }
            System.out.println("Number of odd numbers: " + oddNumberCounter);
            System.out.println("Number of even numbers: " + evenNumberCounter);
            return(returnfix);
        }


    public static void main(String[] args) {
        int[] numbers={5 , 7, 2 , 4 , 9, };
        evenOdd(numbers);
    }
}
