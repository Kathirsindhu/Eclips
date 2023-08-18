package interview;

import java.util.Scanner;

public class SentenceReverse {
	public static void main(String[] args) {
		System.out.println("enter sentence");
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		String[] b = a.split(" ");
		for (int i = b.length - 1; i >= 0; i--) {
			System.out.print(b[i] + " ");

		}
	}
}
