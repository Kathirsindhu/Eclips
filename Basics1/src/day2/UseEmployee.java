package day2;

import java.util.HashMap;

public class UseEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee("kathir", 101, 27, "Ceo");
		Employee e2 = new Employee("karthi", 102, 26, "Gm");
		Employee e3 = new Employee("vetri", 103, 25, "HR");
		Employee e4 = new Employee("muthu", 101, 24, "team");
		HashMap<Integer, Employee> val = new HashMap<>();
		val.put(e1.getId(), e1);
		val.put(e2.getId(), e2);
		val.put(e3.getId(), e3);
		val.put(e4.getId(), e4);
		System.out.println(e1.equals(e4));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
//		val.values().forEach(x -> {
//			System.out.println(x);
//		});

	}
}
