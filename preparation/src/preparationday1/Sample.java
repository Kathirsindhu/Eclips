package preparationday1;

import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
		System.out.println("enter number");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		a = a + b;
		b = a - b;
		a = a - b;
		// swapping
		System.out.println(a);
		System.out.println(b);
	}
}
