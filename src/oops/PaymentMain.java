package oops;

public class PaymentMain {
	public static void main(String[] args) {
		UPIPayment upiPayment = new UPIPayment("UPI Payment", "sai@ybl");
		upiPayment.linkBankAccount("1234567890");

		CardPayment cardPayment = new CardPayment("Card Payment", "1234-5678-9012-3456");
		cardPayment.verifyOTP("123456");

		System.out.println("Payment example program executed successfully.");
	}
}