package oops;

public class UPIPayment extends PaymentMethod {
	 private String upiId;
	    
	    public UPIPayment(String name, String upiId) {
	        super(name);
	        this.upiId = upiId;
	    }
	    
	    public void linkBankAccount(String accountNumber) {
	        System.out.println("Linking bank account " + accountNumber + " to UPI " + upiId);
	    }
	}
