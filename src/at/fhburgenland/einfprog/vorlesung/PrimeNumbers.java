/*
 * Copyright (c) 2021 Daniel Szankovich.
 *  Discord: Bricksmaster#7130
 *  Check out my GitHub: https://github.com/Bricksmaster
 */

package at.fhburgenland.einfprog.vorlesung;

public class PrimeNumbers {

    static boolean isPrime (int n){
        for (int i=2; i<n; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
    for (int i=2; i<=100; i++){
        if (isPrime(i)){
            System.out.print(i + " ");
        }
    }
    }
}
