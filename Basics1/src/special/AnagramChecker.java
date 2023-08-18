package special;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first string: ");
		String str1 = scanner.nextLine();
		System.out.print("Enter the second string: ");
		String str2 = scanner.nextLine();
		scanner.close();

		boolean areAnagrams = checkIfAnagrams(str1, str2);

		if (areAnagrams) {
			System.out.println("The strings are anagrams.");
		} else {
			System.out.println("The strings are NOT anagrams.");
		}
	}

	public static boolean checkIfAnagrams(String str1, String str2) {
		// Remove spaces and convert to lowercase to handle case-insensitivity
		str1 = str1.replaceAll("\\s", "").toLowerCase();
		str2 = str2.replaceAll("\\s", "").toLowerCase();

		// If the lengths are different, they can't be anagrams
		if (str1.length() != str2.length()) {
			return false;
		}

		// Sort both strings and check if they are equal
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);

		return Arrays.equals(charArray1, charArray2);
	}
}
