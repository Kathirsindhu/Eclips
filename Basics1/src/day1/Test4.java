package day1;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		System.out.println("Enter the Sentence: ");
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		System.out.println("Enter the word that what u need to replace");
		String aa = scanner.next();
		System.out.println("Enter the word the word that u want to placed");
		String aaa = scanner.next();
		char[] textChars = a.toCharArray();
		char[] searchWordChars = aa.toCharArray();
		char[] replaceWordChars = aaa.toCharArray();
		int q = 0;
		int w = 0;
		int e = 0;
		for (char x : textChars) {
			q++;
		}
		for (char y : searchWordChars) {
			w++;
		}
		for (char z : replaceWordChars) {
			e++;
		}
	}
}
