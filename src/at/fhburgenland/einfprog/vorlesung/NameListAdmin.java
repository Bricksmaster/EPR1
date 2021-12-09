/*
 * Copyright (c) 2021 Daniel Szankovich.
 *  Discord: Bricksmaster#7130
 *  Check out my GitHub: https://github.com/Bricksmaster
 */

package at.fhburgenland.einfprog.vorlesung;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class NameListAdmin {
    static Scanner scanner = new Scanner(System.in);

    static ArrayList<String> names = new ArrayList<>();

    static void printNames() {
        for (String name : names){
            System.out.println(name);
        }
    }

    static void addName(){
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        names.add(name);
    }

    static void removeName(){
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        if (names.contains(name)){
            names.remove(name);
        }
        else {
            System.out.println(name + " is not in the list!");
        }
    }

    static void sortNames(){
        Collections.sort(names);
        for (String name : names){
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        boolean endProgram = false;
        while (!endProgram) {
            System.out.println();
            System.out.println();
            System.out.println("Main Menu");
            System.out.println("---------");
            System.out.println();
            System.out.println("    L  -> List");
            System.out.println("    A  -> Add Name");
            System.out.println("    R  -> Remove Name");
            System.out.println("    S   -> Sort Names");
            System.out.println("\n    E  -> Exit program");
            System.out.print("\nChoice: ");
            String input = scanner.nextLine().toUpperCase();
            switch (input) {
                case "L" -> printNames();
                case "A" -> addName();
                case "R" -> removeName();
                case "S" -> sortNames();
                case "E" -> endProgram = true;
                default -> System.out.println("Invalid Choice!");
            }
        }
    }
}
