package com.va.week5.ex2;
/*
 * child class. 
 */
public class CurrentAccount extends BankAccount {

    private double overdraftLimit;

    public CurrentAccount(String accountNumber,
                           String customerName,
                           double balance,
                           double overdraftLimit) {
        super(accountNumber, customerName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawal successful: $" + amount);
        } else {
            System.out.println("Withdrawal exceeds overdraft limit.");
        }
    }

    public void displayOverdraftLimit() {
        System.out.println("Overdraft Limit: $" + overdraftLimit);
    }
}
