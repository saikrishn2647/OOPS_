package oops;

public class AnimalMain {
	public static void main(String[] args) {
		Animal animal1 = new Animal();
		Animal cat = new Cat();
		Animal dog = new Dog();

		System.out.println("Calling makeSound on Animal:");
		animal1.makeSound();

		System.out.println("\nCalling makeSound on Cat:");
		cat.makeSound();

		System.out.println("\nCalling makeSound on Dog:");
		dog.makeSound();
	}

}
