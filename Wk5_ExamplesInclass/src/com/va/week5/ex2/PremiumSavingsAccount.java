package com.va.week5.ex2;

public class PremiumSavingsAccount
        extends SavingsAccount
        implements Rewardable {

    private double rewardRate;

    public PremiumSavingsAccount(String accountNumber,
                                 String customerName,
                                 double balance,
                                 double interestRate,
                                 double rewardRate) {
        super(accountNumber, customerName, balance, interestRate);
        this.rewardRate = rewardRate;
    }

    @Override
    public void calculateRewards() {
        double rewards = balance * rewardRate / 100;
        System.out.println("Rewards earned: $" + rewards);
    }

    public void displayPremiumBenefits() {
        System.out.println("Premium account benefits include:");
        System.out.println("- Higher interest rate");
        System.out.println("- Reward points");
    }
}
