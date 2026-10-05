package com.va.week5.ex2;
/*
 * Banking App.. 
 */

/*
 * Parent Class. 
 */
public class BankAccount {

    protected String accountNumber;
    protected String customerName;
    protected double balance;

    public BankAccount(String accountNumber,
                       String customerName,
                       double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful: $" + amount);
        } else {
            System.out.println("Deposit amount must be greater than zero.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful: $" + amount);
        } else {
            System.out.println("Invalid withdrawal.");
        }
    }

    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Balance: $" + balance);
    }

    public void calculateInterest() {
        System.out.println("General bank interest calculation.");
        
    }
}
