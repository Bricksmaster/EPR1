package at.fhburgenland.einfprog.hausuebung;
import java.util.Random;
public class GuessTheNumberFinal {
/*
Anmerkung zu dieser Aufgabe:
Ich habe versucht mit einer do-while-Schleife "Bonus 2" zu lösen, was mir leider nicht gelungen ist,
da ich den String aus newGameInput nicht mit .equals() im While vergleichen konnte.
Ich habe mich etwas eingelesen und eine Lösung mittels der Rekursion gefunden. So konnte ich das Problem lösen.
Sofern Sie einen Lösungsweg für "Bonus 2" mit den bestehenden Methoden haben, würde ich diesen sehr gerne sehen. :D
 */
        public static void main(String[] args) {

            Random r = new Random();
            int number = r.nextInt(10) + 1;
            startGame(number);
        }

        public static void startGame(int randomZahl) {

            java.util.Scanner scanner = new java.util.Scanner((System.in));
            System.out.print("Erraten Sie die Zahl: ");

            String input = scanner.nextLine();
            Random random = new Random();

            int guess = Integer.parseInt(input);

            int counter = 0;

            if (guess == randomZahl) {
                counter += 1;
                System.out.println("GG, Sie haben die Zahl erraten und dafür " + counter + " Versuch(e) benötigt! Möchten Sie nochmal spielen?");
                System.out.print("Schreiben Sie dafür bitte 'Ja', falls nicht drücken Sie bitte 'Enter': ");
                String newGameInput = scanner.nextLine();

                if (newGameInput.equals("Ja") || newGameInput.equals("ja")) {

                    startGame(random.nextInt(10));
                } else {
                    // Spiel wird beendet
                }
            } else {
                counter += 1;
                System.out.println("Leider nicht erraten, probieren Sie es erneut.");
                startGame(randomZahl);
            }
        }
    }

