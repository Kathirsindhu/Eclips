package day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraytoArraylist {
	public static void main(String[] args) {

		Integer[] a = { 1, 2, 3, 4, 5, 6, 7 };

//		List<Integer> lists = Arrays.asList(a);
//		for (int i = 0; i < lists.size(); i++) {
//
//			System.out.println(lists.get(i));
//		}
//		lists.forEach(x -> System.out.println(x));

//		for (int i = 0; i < a.length; i++) {
//			list.add(a[i]);
//		}
//		System.out.println(list);

		// Arraylist to array

		List<Integer> lists = new ArrayList<>();
		lists.add(10);
		lists.add(11);
		lists.add(12);
		lists.add(13);
		lists.add(14);
		// System.out.println(lists);
		int[] aa = lists.stream().mapToInt(Integer::intValue).toArray();
//		// System.out.println(Arrays.toString(aa));
		for (int i = 0; i < aa.length; i++) {
			System.out.println(aa[i]);
		}

//		List<String> words = Arrays.asList("hai", "hello:,");
//		String[] aaa = words.toArray(new String[words.size()]);
//		for (String x : aaa) {
//			System.out.println(x);
//		}

	}
}
