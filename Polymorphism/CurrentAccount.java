package Polymorphism;

import Abstraction.Account;

/**
 * CurrentAccount class inherits from Account and provides a specific implementation of deposit and withdraw.
 */
public class CurrentAccount extends Account {

    private static final double OVERDRAFT_LIMIT = 500;

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to Current Account. Current Balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance + OVERDRAFT_LIMIT >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Current Account. Current Balance: " + balance);
        } else {
            System.out.println("Insufficient funds or overdraft limit reached in Current Account.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
