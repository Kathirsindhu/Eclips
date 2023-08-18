package preparationday1;

public class prime {
	public static void main(String[] args) {
		int[] a = { 13, 17, 7 };
		int b = 0;
		for (int i = 2; i < a.length; i++) {

			if (a[i] % i == 0) {
				System.out.println(a[i] + "given number is not prime");
			}

			else if (b == 1) {
				System.out.println(a[i] + "given number is  prime");
			}

		}
	}
}
