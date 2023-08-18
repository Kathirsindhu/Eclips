package task;

import java.math.BigInteger;

public class Factorialwithoutforloop {

	public static BigInteger factorial(int n) {
		if (n == 0 || n == 1) {
			return BigInteger.ONE;
		}

		BigInteger result = BigInteger.ONE;
		int i = 2;

		while (i <= n) {
			result = result.multiply(BigInteger.valueOf(i));
			i++;
		}

		return result;
	}

	public static void main(String[] args) {
		int num = 5;
		BigInteger result = factorial(num);
		System.out.println("Factorial of " + num + " is: " + result);
	}
}
