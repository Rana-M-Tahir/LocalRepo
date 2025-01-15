package Abstraction;

/**
 * Abstract class representing a general bank account.
 */
public abstract class Account {

    protected double balance;

    /**
     * Abstract method to deposit money, implemented by subclasses.
     * 
     * @param amount The amount to deposit.
     */
    public abstract void deposit(double amount);

    /**
     * Abstract method to withdraw money, implemented by subclasses.
     * 
     * @param amount The amount to withdraw.
     */
    public abstract void withdraw(double amount);

    /**
     * Abstract method to check the account balance.
     * 
     * @return The balance in the account.
     */
    public abstract double getBalance();
}
