package july19task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class fifth {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(2);
		numbers.add(4);
		numbers.add(3);
		numbers.add(5);

		// Uncomment and use the line below to use your desired input list of integers
		// List<Integer> numbers = new ArrayList<>(yourListOfIntegers);

		printDuplicates(numbers);
		printNonDuplicates(numbers);
		printDuplicateCount(numbers);
	}

	// Method to print duplicates in the given list of integers
	public static void printDuplicates(List<Integer> numbers) {
		Map<Integer, Integer> numCountMap = new HashMap<>();

		for (int num : numbers) {
			numCountMap.put(num, numCountMap.getOrDefault(num, 0) + 1);
		}

		System.out.print("Duplicates: ");
		for (int num : numCountMap.keySet()) {
			if (numCountMap.get(num) > 1) {
				System.out.print(num + " ");
			}
		}
		System.out.println();
	}

	// Method to print non-duplicates in the given list of integers
	public static void printNonDuplicates(List<Integer> numbers) {
		Map<Integer, Integer> numCountMap = new HashMap<>();

		for (int num : numbers) {
			numCountMap.put(num, numCountMap.getOrDefault(num, 0) + 1);
		}

		System.out.print("Non-Duplicates: ");
		for (int num : numCountMap.keySet()) {
			if (numCountMap.get(num) == 1) {
				System.out.print(num + " ");
			}
		}
		System.out.println();
	}

	// Method to print the count of duplicates in the given list of integers
	public static void printDuplicateCount(List<Integer> numbers) {
		Map<Integer, Integer> numCountMap = new HashMap<>();

		for (int num : numbers) {
			numCountMap.put(num, numCountMap.getOrDefault(num, 0) + 1);
		}

		int duplicateCount = 0;
		for (int count : numCountMap.values()) {
			if (count > 1) {
				duplicateCount += (count - 1);
			}
		}

		System.out.println("Number of duplicates: " + duplicateCount);
	}
}
