package special;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Practice2 {
	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(1, 2, 3, 3, 7, 7, 9, 200, 21, 17);
		// List<Integer> l = li.stream().sorted(Integer::compare).toList();
//		Set<Integer> l = li.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toSet());
		// List<Integer> l =
		// li.stream().distinct().sorted(Comparator.reverseOrder()).toList();
//		List<Integer> l = li.stream().sorted((x, y) -> y.compareTo(x)).toList();
//		List<Integer> l = li.stream().sorted((x, y) -> x.compareTo(y)).toList();
//		List<Integer> l = li.stream().limit(5).skip(2).toList();
		// List<Integer> l =li.stream().filter(x->x>8).findFirst().toList;
		// List<Integer> l = li.stream().map(x -> String.valueOf(x)).filter(x ->
		// x.startsWith("2"))
		// .map(x -> Integer.valueOf(x)).sorted((x, y) -> y - x).toList();
		// int l = li.stream().max((x,y)->x-y).get();
		// int l = li.stream().max((x,y)->y-x).get();
		// int l = li.stream().reduce((x, y) -> x + y).get();
		// int l = li.stream().reduce(0, (x, y) -> x + y);
		// int l = li.stream().reduce(0, (x, y) -> x > y ? x : y);
		// int l = li.stream().reduce(0, Integer::max);
		int l = li.stream().reduce(Integer::min).get();
		System.out.println(l);
	}
}
