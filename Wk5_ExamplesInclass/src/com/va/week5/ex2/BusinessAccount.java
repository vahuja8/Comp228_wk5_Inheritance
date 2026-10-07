package com.va.week5.ex2;

/*
 * Level 3 -- child of the parent.. 
 * parent is child of the father..
 */
public class BusinessAccount extends CurrentAccount {

    private String businessName;

    public BusinessAccount(String accountNumber,
                           String customerName,
                           double balance,
                           double overdraftLimit,
                           String businessName) {
        super(accountNumber, customerName, balance, overdraftLimit);
        this.businessName = businessName;
    }

    public void processBusinessPayment(double amount) {
        System.out.println("Processing business payment of $" + amount);
        withdraw(amount);
    }

    public void displayBusinessInformation() {
        System.out.println("Business Name: " + businessName);
    }
}
