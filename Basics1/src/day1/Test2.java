package day1;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("Enter the sentence: ");
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
//		System.out.println("Enter the word that what u need to replace");
//		String a2 = scanner.next();
//		System.out.println("Enter the word the word that u want to placed ");
//		String a3 = scanner.next();
		char[] aba = a.toCharArray();
		int q = 0;
		for (char x : aba) {
			q++;
		}
		System.out.println(q);
//		String aa = a.replace(a2, a3);
//		System.out.println(aa);
	}
}
