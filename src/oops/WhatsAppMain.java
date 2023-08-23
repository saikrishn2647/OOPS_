package oops;

public class WhatsAppMain {
	public static void main(String[] args) {
		// Creating WhatsAppUser objects using the constructor
		WhatsAppUser user1 = new WhatsAppUser("sai", "8555839617", 24);
		WhatsAppUser user2 = new WhatsAppUser("dixith", "8374758774", 24);

		// Calling methods for user1
		user1.displayInfo();
		user1.setOnlineStatus(true);
		user1.sendMessage("Hello there!");

		// Calling methods for user2
		user2.displayInfo();
		user2.setOnlineStatus(false);
		user2.sendMessage("Hi, how are you?");
	}
}
