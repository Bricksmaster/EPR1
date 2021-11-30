/*
 * Copyright (c) 2021 Daniel Szankovich.
 *  Discord: Bricksmaster#7130
 *  Check out my GitHub: https://github.com/Bricksmaster
 */

package at.fhburgenland.einfprog.vorlesung;

public class Palindrome {

    static boolean isPalindrome (String word){
        boolean isPalindrome = true;
        for (int i = 0; i< (word.length()/2) && isPalindrome; i++){
            if (word.charAt(i) != word.charAt(word.length() - 1 )){
                isPalindrome = false;
            }
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        if (isPalindrome("abcba")){
            System.out.println("Ein Palindrom");
        }
        else {
            System.out.println("Kein Palindrom");
        }
    }
}
