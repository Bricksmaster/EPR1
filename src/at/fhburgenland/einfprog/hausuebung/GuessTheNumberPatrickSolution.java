package at.fhburgenland.einfprog.hausuebung;

public class GuessTheNumberPatrickSolution {

    public static void main(String[] args) {

        startGame();
    }

    public static void startGame() {

        java.util.Scanner scanner = new java.util.Scanner((System.in));
        System.out.print("Rate die Zahl: ");
        String input = scanner.nextLine();

        int guess = Integer.parseInt(input);

        if (guess == 5) { //Statische Zahl, kann ersetzt werden durch zufalls zahl
            System.out.print("neues game?: ");
            String newGameInput = scanner.nextLine();

            if (newGameInput.equals("ja")) {
                //neue random zahl generieren
                startGame();
            } else {
                // game is over
            }
        } else {
            System.out.println("Probiers nochmal");
            startGame();
        }
    }
}
