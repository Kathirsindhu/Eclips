package special;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class K2 {
	public static void main(String[] args) {
		List<String> a = Arrays.asList("one", "two", "one", "three");
		Set<String> b = new HashSet<>();
		for (String x : a) {
			System.out.println(x);
			b.add(x);
		}
		ArrayList<String> aa = new ArrayList<>(b);
		System.out.println(aa.toString());

	}
}
