/*
 * Copyright (c) 2021 Daniel Szankovich.
 *  Discord: Bricksmaster#7130
 *  Check out my GitHub: https://github.com/Bricksmaster
 */

package at.fhburgenland.einfprog.vorlesung;

public class PadRight {

    static String padRight(String s, int len) {
        String result = s;
        while (result.length() < len) {
            result = result + " ";
        }
        return result;
    }

    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Miller";
        int age = 42;
        System.out.println(padRight("Hello", 7) + "World");
        System.out.println(padRight("First Name: ", 15) + firstName);
        System.out.println(padRight("Last Name: ", 15) + lastName);
        System.out.println(padRight("Age: ", 15) + age);
    }
}

