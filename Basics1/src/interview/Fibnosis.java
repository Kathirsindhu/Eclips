package interview;

import java.util.Scanner;

public class Fibnosis {
	public static void main(String[] args) {
		System.out.println("enter number");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = 0;
		int c = 1;
		int d = 0;
		for (int i = 0; i < a; i++) {
			b = c;
			c = d;
			d = b + c;
			System.out.println(d);
		}

	}
}
