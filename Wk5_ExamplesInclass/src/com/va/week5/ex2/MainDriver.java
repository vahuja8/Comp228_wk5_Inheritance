package com.va.week5.ex2;

public class MainDriver {

	public static void main(String[] args) {

		System.out.println("====================================");
		System.out.println("       BANKING APPLICATION");
		System.out.println("====================================");

		// SINGLE INHERITANCE
		System.out.println("\n--- Savings Account ---");

		SavingsAccount savings = new SavingsAccount("SA1001", "John Smith", 10000, 4.5);

		savings.displayAccount();
		savings.deposit(1000);
		savings.withdraw(500);
		savings.displayAccount();
		savings.calculateInterest();
		savings.addInterest();

		// HIERARCHICAL INHERITANCE
		System.out.println("\n--- Current Account ---");

		CurrentAccount current = new CurrentAccount("CA2001", "Sarah Johnson", 5000, 2000);

		current.displayAccount();
		current.displayOverdraftLimit();
		current.withdraw(6000);

		// MULTILEVEL INHERITANCE
		System.out.println("\n--- Business Account ---");

		BusinessAccount business = new BusinessAccount("BA3001", "David Brown", 20000, 10000, "ABC Technologies");

		business.displayAccount();
		business.displayBusinessInformation();
		business.processBusinessPayment(5000);

		// MULTILEVEL + INTERFACE
		System.out.println("\n--- Premium Savings Account ---");

		PremiumSavingsAccount premium = new PremiumSavingsAccount("PS4001", "Michael Lee", 25000, 5.5, 2.0);

		premium.displayAccount();
		premium.calculateInterest();
		premium.calculateRewards();  // this is frm interface method.. that has been 
		//implemented.. 
		premium.displayPremiumBenefits();

		// POLYMORPHISM
		System.out.println("\n--- POLYMORPHISM ---");

		BankAccount account1 = savings;
		BankAccount account2 = current;
		BankAccount account3 = premium;

		account1.calculateInterest();
		account2.calculateInterest();
		account3.calculateInterest();
	}
}
