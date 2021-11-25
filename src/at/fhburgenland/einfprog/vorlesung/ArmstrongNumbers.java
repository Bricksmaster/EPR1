/*
 * Copyright (c) 2021 Daniel Szankovich.
 *  Discord: Bricksmaster#7130
 *  Check out my GitHub: https://github.com/Bricksmaster
 */

package at.fhburgenland.einfprog.vorlesung;

public class ArmstrongNumbers {

    static void armstrong(int lowerLimit, int upperLimit){

        if (lowerLimit < 100){
            System.out.println("Number has to be bigger than 100!");
            return;
        }
        if (upperLimit <= lowerLimit){
            System.out.println("UpperLimit has to be bigger than the LowerLimit");
            return;
        }

        for (int i=lowerLimit; i<=upperLimit; i++){

            int onesdigit = i % 10;
            int tensdigit = ( i / 10) % 10;
            int hundretsdigit = ( i / 100) % 10;

           int sum = cube(onesdigit) + cube(tensdigit) + cube(hundretsdigit);

            if (sum == i){
                System.out.print(i + " ");
            }
        }
    }

    static int cube(int number){
        return number*number*number;
    }

    public static void main(String[] args) {
        armstrong(100, 500);
    }
}
