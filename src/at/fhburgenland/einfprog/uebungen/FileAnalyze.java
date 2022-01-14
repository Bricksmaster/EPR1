/*
 * Copyright (c) 2022 Daniel Szankovich.
 *  Discord: Bricksmaster#7130
 *  Check out my GitHub: https://github.com/Bricksmaster
 */

package at.fhburgenland.einfprog.uebungen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileAnalyze {
    public static void main(String[] args) {
        int linecounter = 0;
        int charcounter = 0;
        int capitalcounter = 0;
        int digitcounter = 0;
        File f = new File("data/loremipsum.txt");
        Scanner myReader = null;
        try {
            myReader = new Scanner(f);
        } catch (FileNotFoundException e) {
            System.out.println("Datei nicht vorhanden!");
        }
        //Try Catch automatisch vorgeschlagen

        while (myReader.hasNextLine()){
            String line = myReader.nextLine();
            linecounter++;
            for (char c : line.toCharArray()){
                if(Character.isUpperCase(c)){
                    capitalcounter++;
                }
                else if (Character.isLowerCase(c)){
                    charcounter++;
                }
                else if (Character.isDigit(c)){
                    digitcounter++;
                }
            }
        }
        System.out.println("lower characters: " + charcounter);
        System.out.println("capital characters: " + capitalcounter);
        System.out.println("number characters: " + digitcounter);




        myReader.close();
    }
}
