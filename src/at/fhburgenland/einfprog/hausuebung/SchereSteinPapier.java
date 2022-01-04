/*
 * Copyright (c) 2021 Daniel Szankovich.
 *  Discord: Bricksmaster#7130
 *  Check out my GitHub: https://github.com/Bricksmaster
 */

package at.fhburgenland.einfprog.hausuebung;

import java.util.Random;

public class SchereSteinPapier {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner((System.in));
        boolean playgame = true;
        boolean endquestion = true;

        while (playgame) {

            //Rock == 1
            //Paper == 2
            //Scissors == 3
            System.out.println("Welcome to Rock/Paper/Scissors Game!");
            System.out.println("You will play against a very intelligent KI");
            System.out.println("Please only enter one number!");
            System.out.print("Choose: Rock (1) | Paper (2) | Scissors (3):");
            String userInput = scanner.nextLine();
            int userMove = Integer.parseInt(userInput);


            if (userMove < 1 || userMove > 3) {
                System.out.println("Please enter a valid move!");
                break;
            }

            Random r = new Random();
            int computerMove = r.nextInt(3)+1;


            if (userMove == computerMove){
                System.out.println("Even!");

            }
            else if (userMove == 1) {
                if (computerMove == 3) {
                    System.out.println("User you won!");
                    System.out.println("The KI used the Scissors against you!");
                } else if (computerMove == 2) {
                    System.out.println("User you lost!");
                    System.out.println("The KI used the Paper against you!");
                }
            }

            if (userMove == 2){
                if (computerMove == 3){
                    System.out.println("User you lost!");
                    System.out.println("The KI used the Scissors against you!");
                }
                else if (computerMove == 1){
                    System.out.println("User you won!");
                    System.out.println("The KI used the Rock against you!");
                }
            }

            if (userMove == 3){
                if (computerMove == 2){
                    System.out.println("User you won!");
                    System.out.println("The KI used the Paper against you!");
                }
                else if (computerMove == 1){
                    System.out.println("User you lost!");
                    System.out.println("The KI used the Rock against you!");
                }
            }

                while (endquestion == true){
                    System.out.println("Do you wanna play again?");
                    System.out.print("Write yes (y) or no (n)");
                    String userInputEnd = scanner.nextLine();

                    if (userInputEnd.equals("n") || userInputEnd.equals("N")) {
                        playgame = false;
                        endquestion = false;
                    }
                    else if (userInputEnd.equals("y") || userInputEnd.equals("Y")){
                        endquestion = false;
                    }
                    else{
                        System.out.println("Please only use 'y' or 'n' as an answer!");

                    }
                }
        }
    }
}
