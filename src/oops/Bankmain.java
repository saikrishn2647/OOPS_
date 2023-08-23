package oops;

public class Bankmain {
	
	    public static void main(String[] args) {
	        // Creating bank accounts
	        Bank account1 = new Bank("saikrishna", 1000);
	        Bank account2 = new Bank("dixith", 2000);
	        
	        // Depositing and withdrawing
	        account1.deposit(500);
	        account2.withdraw(300);
	        
	        // Displaying total accounts
	        System.out.println("Total bank accounts: " + Bank.getTotalAccounts());
	    }
	}



