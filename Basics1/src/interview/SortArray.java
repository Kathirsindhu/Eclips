package interview;

public class SortArray {

	public static void main(String[] args) {
		int[] array = { 10, 5, 2, 7, 3, 1, 9, 4, 8, 6 };

		// Sort the array in ascending order.
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		// Print the sorted array.
//		for (int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);
//		}
		// print descending
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}
	}
}
