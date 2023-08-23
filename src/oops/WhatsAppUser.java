package oops;

class WhatsAppUser {
	// Attributes or Fields
	String name;
	String phoneNumber;
	int age;
	boolean isOnline;

	// Constructor
	public WhatsAppUser(String name, String phoneNumber, int age) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.age = age;
		this.isOnline = false;
	}

	// Method to send a message
	public void sendMessage(String message) {
		System.out.println(name + " sent: " + message);
	}

	// Method to display user information
	public void displayInfo() {
		System.out.println("User Details:");
		System.out.println("Name: " + name);
		System.out.println("Phone Number: " + phoneNumber);
		System.out.println("Age: " + age);
		System.out.println("Online Status: " + (isOnline ? "Online" : "Offline"));
	}

	// Method to set online status
	public void setOnlineStatus(boolean online) {
		isOnline = online;
	}
}
