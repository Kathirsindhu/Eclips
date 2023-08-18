package task;

import java.math.BigInteger;

public class BigIntegerExample {

	public static void main(String[] args) {
		// Create two BigInteger objects
		BigInteger num1 = new BigInteger("12345678901234567890");
		BigInteger num2 = new BigInteger("98765432109876543210");

		// Perform some arithmetic operations
		BigInteger sum = num1.add(num2);
		BigInteger difference = num1.subtract(num2);
		BigInteger product = num1.multiply(num2);
		BigInteger quotient = num2.divide(num1);

		// Print the results
		System.out.println("Sum: " + sum);
		System.out.println("Difference: " + difference);
		System.out.println("Product: " + product);
		System.out.println("Quotient: " + quotient);
	}
}
