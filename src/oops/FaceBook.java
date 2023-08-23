package oops;
public class FaceBook {

	// Method Overloading - Login with different parameters
	public void login(String username, String password) {
		System.out.println("Logging in with username: " + username);
	}

	public void login(long phoneNumber, String password) {
		System.out.println("Logging in with phone number: " + phoneNumber);
	}

	public void login(String email, String password, boolean rememberMe) {
		System.out.println("Logging in with email: " + email + ", Remember Me: " + rememberMe);
	}
}