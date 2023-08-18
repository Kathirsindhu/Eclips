package task;

import java.util.function.Supplier;

public class SupplierExample {
	public static void main(String[] args) {
		// Create a Supplier that generates a random number between 1 and 100
		Supplier<Integer> randomNumberSupplier = () -> (int) (Math.random() * 100) + 1;

		// Get and print a random number using the Supplier
		int randomNumber = randomNumberSupplier.get();
		System.out.println("Random Number: " + randomNumber);

		// You can reuse the Supplier to get another random number
		int anotherRandomNumber = randomNumberSupplier.get();
		System.out.println("Another Random Number: " + anotherRandomNumber);
		int thirdrandom = randomNumberSupplier.get();
		System.out.println("Third random number: " + thirdrandom);
	}
}
