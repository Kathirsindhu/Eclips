package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
	public static void main(String[] args) {
		ArrayList<String> n = new ArrayList<>();
		n.add("kathir");
		n.add("karthi");
		n.add("vetri");
		n.add("bala");
		n.add("srini");
		n.add("ajith");
		n.add("remo");
		n.add("sakthi");
		n.stream().filter((x) -> x.startsWith("k")).forEach((x) -> System.out.println(x));
		List<String> ka = n.stream().filter((x) -> x.startsWith("k")).collect(Collectors.toList());
		System.out.println(ka);
		long a = n.stream().filter((x) -> x.startsWith("k")).count();
		System.out.println(a);

	}
}
