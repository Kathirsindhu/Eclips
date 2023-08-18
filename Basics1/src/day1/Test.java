package day1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		System.out.println("Enter the Sentence: ");
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		System.out.println("Enter the word that what u need to replace");
		String aa = scanner.next();
		System.out.println("Enter the word the word that u want to placed");
		String aaa = scanner.next();
		String[] b = a.split(" ");
		for (int i = 0; i < b.length; i++) {
			if (b[i].equalsIgnoreCase(aa)) {
				b[i] = aaa;
			}
		}
		int aba = 0;
		for (String x : b) {
			aba = aba++;
		}

	}
}
