package interview;

import java.util.HashMap;

public class DuplicateCharacters {

	public static void main(String[] args) {
		String string = "hello world";
		HashMap<Character, Integer> charCountMap = new HashMap<>();

		for (char c : string.toCharArray()) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}

		System.out.println("Duplicate characters in the string: ");
		for (Character c : charCountMap.keySet()) {
			if (charCountMap.get(c) > 1) {
				System.out.println(c);
			}
		}
	}
}
