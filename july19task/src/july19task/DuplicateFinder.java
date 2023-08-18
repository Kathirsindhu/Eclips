package july19task;

import java.util.HashMap;
import java.util.Map;

public class DuplicateFinder {
	public static void main(String[] args) {
		String inputString = "onesofttechnologies";

		// Uncomment the line below and replace the inputString with your desired input
		// String inputString = "Your desired input string";

		printDuplicates(inputString);
		printNonDuplicates(inputString);
		printDuplicateCount(inputString);
	}

	// Method to print duplicates in the given string
	public static void printDuplicates(String input) {
		Map<Character, Integer> charCountMap = new HashMap<>();

		for (char ch : input.toCharArray()) {
			charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
		}

		System.out.print("Duplicates: ");
		for (char ch : charCountMap.keySet()) {
			if (charCountMap.get(ch) > 1) {
				System.out.print(ch + " ");
			}
		}
		System.out.println();
	}

	// Method to print non-duplicates in the given string
	public static void printNonDuplicates(String input) {
		Map<Character, Integer> charCountMap = new HashMap<>();

		for (char ch : input.toCharArray()) {
			charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
		}

		System.out.print("Non-Duplicates: ");
		for (char ch : charCountMap.keySet()) {
			if (charCountMap.get(ch) == 1) {
				System.out.print(ch + " ");
			}
		}
		System.out.println();
	}

	// Method to print the count of duplicates in the given string
	public static void printDuplicateCount(String input) {
		String inputString = "onesofttechnologies";
		Map<Character, Integer> charCountMap = new HashMap<>();

		for (char ch : inputString.toCharArray()) {
			if (charCountMap.containsKey(ch)) {
				charCountMap.put(ch, charCountMap.get(ch) + 1);
			} else {
				charCountMap.put(ch, 1);
			}
		}
		for (Character c : charCountMap.keySet()) {
			System.out.println(c + " : " + charCountMap.get(c));
		}
	}
}
