package interviewPrograms2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SortIntArrayByStreams {

	public static void main(String[] args) {
		int[] array = { 5, 4, 3, 2, 1 };

		// Sort the array using streams
		IntStream sortedStream = Arrays.stream(array).sorted();

		// Get the sorted array from the stream
		int[] sortedArray = sortedStream.toArray();

		// Print the sorted array
		System.out.println(Arrays.toString(sortedArray));
	}
}
