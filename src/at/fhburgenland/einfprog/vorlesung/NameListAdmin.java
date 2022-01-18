/*
 * Copyright (c) 2021 Daniel Szankovich.
 *  Discord: Bricksmaster#7130
 *  Check out my GitHub: https://github.com/Bricksmaster
 */

package at.fhburgenland.einfprog.vorlesung;
import java.io.*;
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

    static void readNamesfromList(){
        File f = new File("data/namelist.txt");
        try {
            Scanner myReader = new Scanner(f);
            while (myReader.hasNextLine()){
                String line = myReader.nextLine();
                names.add(line);
            }
            System.out.println("All Names read from file!");
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static void writeNamestoList(){
        File f = new File("data/namelist.txt");
        try {
            PrintWriter myWriter = new PrintWriter(new FileWriter(f));

            for (String name : names){
                myWriter.println(name);
            }
            myWriter.close();
            System.out.println("Names written to file!");
            //Close ist wichtig!
        } catch (IOException e) {
            e.printStackTrace();
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
            System.out.println("    S  -> Sort Names");
            System.out.println("    FR -> Read Names from File");
            System.out.println("    FW -> Write Names to File");
            System.out.println("\n    E  -> Exit program");
            System.out.print("\nChoice: ");
            String input = scanner.nextLine().toUpperCase();
            switch (input) {
                case "L" -> printNames();
                case "A" -> addName();
                case "R" -> removeName();
                case "S" -> sortNames();
                case "FR"-> readNamesfromList();
                case "FW"-> writeNamestoList();
                case "E" -> endProgram = true;
                default -> System.out.println("Invalid Choice!");
            }
        }
    }
}
