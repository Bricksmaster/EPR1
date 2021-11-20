/*
 * Copyright (c) 2021 Daniel Szankovich.
 *  Discord: Bricksmaster#7130
 *  Check out my GitHub: https://github.com/Bricksmaster
 */

package at.fhburgenland.einfprog.hausuebung;

import  java.util.Random;

public class StudentSelector {


    public static void main(String[] args) {
        String[] students = {
                "John",
                "Jill",
                "Jack",
                "Josefine",
                "Julian",
                "Jesse"
        };

        while (true){

            Random r = new Random();
            int number = r.nextInt(students.length);

            java.util.Scanner scanner = new java.util.Scanner((System.in));
            System.out.println("\nPress ENTER to see a random student name...");
            System.out.print("Type any character and press ENTER to exit: ");
            String input = scanner.nextLine();

            if (!input.equals("")){
                break;
            }

            System.out.println(students[number]);
        }
    }
}
