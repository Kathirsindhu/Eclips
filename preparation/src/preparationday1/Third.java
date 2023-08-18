package preparationday1;

import java.util.Arrays;
import java.util.Comparator;

public class Third {
	public static void main(String[] args) {
		int[] arr = { 2, 6, 7, 8, 5, 6, 7, 4, 9, 10 };
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);// asc
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);// desc
		}
		int sh = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

		System.out.println(sh);// second highest

		int i, j, u;
		for (i = 0; i < arr.length; i++) {
			u = 1;
			for (j = i + 1; j < arr.length; j++) {
				if (arr[j] == arr[i]) {
					u = u + 1;
				} else {
					break;
				}
			}

			i = j - 1;
			if (u > 1) {
				System.out.println(arr[i] + "-- " + u);// count and print duplicate
			}
		}
	}
}
