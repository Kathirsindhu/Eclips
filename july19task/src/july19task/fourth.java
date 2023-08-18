package july19task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class fourth {
	public static void main(String[] args) {
//		String a = "1,8,5,3,2";
//		String[] b = a.split(",");
//		// List<String> c = Arrays.asList(b);
//		// System.out.println(c);
//		int[] d = new int[b.length];
//		for (int i = 0; i < b.length; i++) {
//			d[i] = Integer.parseInt(b[i]);
//		}
//		for (Integer x : d) {
//			System.out.println(x);
//		}
//		List<int[]> e = Arrays.asList(d);
//		List<int[]> f = e.stream().sorted().collect(Collectors.toList());
//		f.forEach(x -> System.out.print(x));

		// chatgpt

		// Sample input string containing numbers separated by spaces
		String inputString = "10 5 2 7 15 3";

		// Split the input string into individual number strings
		String[] numberStrings = inputString.split(" ");

		// Create an ArrayList to store the integers
		ArrayList<Integer> numbersList = new ArrayList<>();

		// Convert the number strings to integers and add them to the ArrayList
		for (String numberString : numberStrings) {
			int number = Integer.parseInt(numberString);
			numbersList.add(number);
		}

		// Sort the ArrayList in ascending order
		Collections.sort(numbersList);

		// Display the sorted integers
		System.out.print("Ascending Order: ");
		for (int number : numbersList) {
			System.out.print(number + " ");
		}
	}

}
