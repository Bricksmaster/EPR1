/*
 * Copyright (c) 2021 Daniel Szankovich.
 *  Discord: Bricksmaster#7130
 *  Check out my GitHub: https://github.com/Bricksmaster
 */

package at.fhburgenland.einfprog.hausuebung.konto;

import java.util.Objects;

public class BankAccount {
    private final String acccountNumber;
    private final String accountOwner;
    double balance;

    void withdrawal(double amount){
        if (balance - amount <=0 ){
            System.out.println("Your account " + getAccountNumber() +
                    " does not have enough money for a withdrawal of " + amount + "EUR!");
        }
        else {
            setBalance(balance-amount);
        }
    }

    void deposit (double amount){
        setBalance(balance+amount);
    }

    public BankAccount(String acccountNumber, String accountOwner) {
        this.acccountNumber = acccountNumber;
        this.accountOwner = accountOwner;
        this.balance = 0;
    }

    public BankAccount(String acccountNumber, String accountOwner, double balance) {
        this.acccountNumber = acccountNumber;
        this.accountOwner = accountOwner;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return acccountNumber;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return Objects.equals(acccountNumber, that.acccountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(acccountNumber);
    }

    @Override
    public String toString() {
        return "Accountnumber: " + acccountNumber + '\n' +
                "Accountowner: " + accountOwner + '\n' +
                "Balance: " + balance + '\n';
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
