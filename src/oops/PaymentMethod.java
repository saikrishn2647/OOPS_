package oops;

public class PaymentMethod {
	
	    protected String name;
	    
	    public PaymentMethod(String name) {
	        this.name = name;
	    }
	    
	    public void makePayment(double amount) {
	        System.out.println("Making payment of $" + amount + " using " + name);
	    }
	}

	

