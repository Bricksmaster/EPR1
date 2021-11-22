/*
 * Copyright (c) 2021 Daniel Szankovich.
 *  Discord: Bricksmaster#7130
 *  Check out my GitHub: https://github.com/Bricksmaster
 */

package at.fhburgenland.einfprog.hausuebung;

import java.util.Arrays;

public class EvenAndOddIntegers {

        static void  evenOdd(int[] numbers ){

            for (int i=0; i<numbers.length; i++){
                if (numbers[i]!= 1 && numbers[i]!= 2 && numbers[i]!= 3
                        && numbers[i]!= 4 && numbers[i]!= 5 && numbers[i]!= 6
                        && numbers[i]!= 7 && numbers[i]!= 8
                        && numbers[i]!= 9 &&numbers[i]!= 0 ){
                    System.out.println("Please enter numbers only!");
                    return;
                }
            }

            int evenNumberCounter = 0;
            int oddNumberCounter = 0;

            for (int i=0; i<numbers.length; i++){

                if (numbers[i] % 2 == 0 ){
                    evenNumberCounter+=1;
                }
                else{
                    oddNumberCounter+=1;
                }
            }
            System.out.println("Number of odd numbers: " + oddNumberCounter);
            System.out.println("Number of even numbers: " + evenNumberCounter);
        }


    public static void main(String[] args) {
        int[] numbers={5 , 7, 2 , 4 , 9, };
        evenOdd(numbers);
    }
}
