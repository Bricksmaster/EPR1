/*
 * Copyright (c) 2021 Daniel Szankovich.
 *  Discord: Bricksmaster#7130
 *  Check out my GitHub: https://github.com/Bricksmaster
 */

package at.fhburgenland.einfprog.hausuebung.konto;

public class MainBankAccount {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("19522", "Daniel");
        BankAccount bankAccount1 = new BankAccount("1955", "Uwe", 1500);
        bankAccount.deposit(100);
        bankAccount1.withdrawal(1600);
        System.out.println(bankAccount);
        System.out.println(bankAccount1);

    }
}
