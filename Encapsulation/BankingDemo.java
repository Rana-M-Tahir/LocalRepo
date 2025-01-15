package Encapsulation;

import Abstraction.Account;
import Inheritance.SavingsAccount;
import Polymorphism.CurrentAccount;

/**
 * Demo class to show Abstraction, Inheritance, Polymorphism, and Encapsulation in a banking system.
 */
public class BankingDemo {

    public static void main(String[] args) {
        // Create accounts for both Savings and Current
        Account savingsAccount = new SavingsAccount();
        Account currentAccount = new CurrentAccount();

        // Encapsulation: Perform operations on these accounts
        savingsAccount.deposit(500);
        currentAccount.deposit(1000);

        savingsAccount.withdraw(200);
        currentAccount.withdraw(1500);

        // Display balances
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
        System.out.println("Current Account Balance: " + currentAccount.getBalance());
    }
}
