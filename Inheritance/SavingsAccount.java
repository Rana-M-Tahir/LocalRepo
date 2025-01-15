package Inheritance;



import Abstraction.Account;

/**
 * SavingsAccount class inherits from Account and implements its own methods.
 */
public class SavingsAccount extends Account {

    private static final double MIN_BALANCE = 100;

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to Savings Account. Current Balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Savings Account. Current Balance: " + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal in Savings Account.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
