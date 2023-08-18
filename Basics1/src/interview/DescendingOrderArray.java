package interview;

import java.util.Arrays;

public class DescendingOrderArray {

	public static void main(String[] args) {
		int[] array = { 1, 2, 5, 6 };

		// Create a temporary array to store the sorted elements
		int[] tempArray = new int[array.length];

		// Iterate through the original array and copy the elements in descending order
		// to the temporary array
		for (int i = array.length - 1; i >= 0; i--) {
			tempArray[array.length - 1 - i] = array[i];
		}

		// Print the elements of the temporary array
		for (int i = 0; i < tempArray.length; i++) {
			System.out.print(tempArray[i] + " ");
		}
	}
}
