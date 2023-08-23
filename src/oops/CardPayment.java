package oops;

public class CardPayment extends PaymentMethod {
    private String cardNumber;
    
    public CardPayment(String name, String cardNumber) {
        super(name);
        this.cardNumber = cardNumber;
    }
    
    public void verifyOTP(String otp) {
        System.out.println("Verifying OTP " + otp + " for card " + cardNumber);
    }
}

