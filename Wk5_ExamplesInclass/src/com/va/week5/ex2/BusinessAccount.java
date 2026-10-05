package com.va.week5.ex2;

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
