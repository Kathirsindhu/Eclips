package interview;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		System.out.println("enter number");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = 0;
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				b = b + 1;
			}
		}
		if (b == 0) {
			System.out.println("its  a prime number");
		} else {
			System.out.println("its not a prime number");
		}
	}
}
