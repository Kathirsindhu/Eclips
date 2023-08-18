package special;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine().toLowerCase();
		scanner.close();

		boolean isPangram = checkPangram(input);

		if (isPangram) {
			System.out.println("The input is a pangram.");
		} else {
			System.out.println("The input is NOT a pangram.");
		}
	}

	public static boolean checkPangram(String str) {
		Set<Character> alphabetSet = new HashSet<>();
		// removing all non-alphabetic characters in string
//		String removingSentence = str.replaceAll("[^a-zA-Z]","").toLowerCase(); 
		for (char ch : str.toCharArray()) {
			if (Character.isLetter(ch)) {
				alphabetSet.add(ch);
			}
		}

		return alphabetSet.size() == 26;
	}
}
