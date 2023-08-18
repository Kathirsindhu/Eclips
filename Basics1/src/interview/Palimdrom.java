package interview;

import java.util.Scanner;

public class Palimdrom {
	public static void main(String[] args) {
		System.out.println("enter the word");
		Scanner s = new Scanner(System.in);
		String a = s.next();
		String b = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			b = b + a.charAt(i);
		}
		if (b.equals(a)) {
			System.out.println(a + " is a polindrom");
		} else {
			System.out.println(a + " is not a palindrom");
		}
	}
}
