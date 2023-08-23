package oops;

class Bank {
	// Static field
	static int totalAccounts = 0;

	// Non-static fields
	String accountHolderName;
	double accountBalance;

	// Constructor
	public Bank(String name, double initialBalance) {
		accountHolderName = name;
		accountBalance = initialBalance;
		totalAccounts++;
	}

	// Non-static method to deposit
	void deposit(double amount) {
		accountBalance += amount;
		System.out.println("Deposited $" + amount + " into account of " + accountHolderName);
	}

	// Non-static method to withdraw
	void withdraw(double amount) {
		if (accountBalance >= amount) {
			accountBalance -= amount;
			System.out.println("Withdrawn $" + amount + " from account of " + accountHolderName);
		} else {
			System.out.println("Insufficient balance for withdrawal from account of " + accountHolderName);
		}
	}

	// Static method to get total accounts
	static int getTotalAccounts() {
		return totalAccounts;
	}
}
