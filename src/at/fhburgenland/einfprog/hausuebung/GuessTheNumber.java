package at.fhburgenland.einfprog.hausuebung;

import java.util.Random;

public class GuessTheNumber {

        public static void main(String[] args) {
          while(true) {

              int tries = 0;
              boolean hasNotFinished = true;
              Random r = new Random();
              int number = r.nextInt(10) + 1;

              while(true) {

                  java.util.Scanner scanner = new java.util.Scanner((System.in));
                  System.out.print("\nGuess the number: ");
                  String input = scanner.nextLine();

                  int guess = Integer.parseInt(input);

                  tries += 1;

                  if (number == guess) {
                      System.out.println("\nYou got it!");
                      System.out.println("You've used " + tries + " try/tries");
                      hasNotFinished = false;
                      break;

                  } else {
                      System.out.println("\nSorry, that is not correct!");
                      System.out.println("This was your " + tries + " try/tries");

                  }
              }

              java.util.Scanner scanner = new java.util.Scanner((System.in));
              System.out.println("\nDo you want to exit?");
              System.out.print("Write 'exit' or enter: ");
              String endQuestion = scanner.nextLine();

              if (endQuestion.equals("exit")) {
                  return;
              }
          }
        }
    }

