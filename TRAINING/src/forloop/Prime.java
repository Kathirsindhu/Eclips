package forloop;

public class Prime {
	public static void main(String[] args) {
		int a = 6;
		boolean isPrime = true;
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				isPrime = false;
			}
		}
		if (isPrime == true) {
			System.out.println(a + " is a prime number");
		} else {
			System.out.println(a + " is not a prime number");
		}
	}
}
