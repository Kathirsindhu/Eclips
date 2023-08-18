package july19task;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class second {
	public static void main(String[] args) {
		Integer[] arr = { 2, 6, 7, 8, 10, 5, 2 };
		List<Integer> num = Arrays.asList(arr);
//		List<Integer> nums = num.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//		System.out.println(nums);
		int a = num.stream().sorted(Comparator.reverseOrder()).skip(1).findAny().get();
		System.out.println(a);
	}
}
