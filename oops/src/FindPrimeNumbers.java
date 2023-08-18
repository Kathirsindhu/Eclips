

public class FindPrimeNumbers {
	public static void main(String[] args) {

		int[] array = { 9, 11, 13, 4, 17 };

		// Find prime numbers in the array
		int[] primeNumbers = new int[3];
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (isPrime(array[i])) {
				primeNumbers[count] = array[i];
				count++;
			}
		}

		// Print prime numbers
		System.out.println("Prime numbers in the array: ");
		for (int i = 0; i < count; i++) {
			System.out.print(primeNumbers[i] + " ");
		}
	}

	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}

		for (int i = 2; i * i <= number; i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}
}
