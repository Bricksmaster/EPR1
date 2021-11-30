/*
 * Copyright (c) 2021 Daniel Szankovich.
 *  Discord: Bricksmaster#7130
 *  Check out my GitHub: https://github.com/Bricksmaster
 */

package at.fhburgenland.einfprog.vorlesung;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class NameList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String input = " ";
        while (!input.equals("")){
            System.out.print("Add a Name (ENTER to cancel): ");
            input = scanner.nextLine();
            names.add(input);
        }
        Collections.sort(names);
        for (String name : names){
            System.out.println(name);
        }
    }
}
