package interview;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = 1;
		for (int i = 1; i <= a; i++) {
			b = b * i;
		}
		System.out.println(b + " is factorial value");
	}
}
