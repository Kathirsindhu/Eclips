package list;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class UseEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee("kathir", 15, "male", 15000);
		Employee e2 = new Employee("vetri", 24, "kkk", 20000);
		Employee e3 = new Employee("karthi", 13, "fe	 male", 25000);
		ArrayList<Employee> ee = new ArrayList<>();
		ee.add(e3);
		ee.add(e2);
		ee.add(e1);
		System.out.println(ee);
		for (int i = 0; i < ee.size(); i++) {

			if (ee.get(i).getAge() >= 20) {
				int s = ee.get(i).getSalary() + ee.get(i).getSalary() * 12 / 100;
				ee.get(i).setSalary(s);
			}
		}
		System.out.println(ee);
		ee.forEach(x -> {
			int s = x.getSalary() + x.getSalary() * 12 / 100;
			if (x.getAge() > 20) {
				x.setSalary(s);
			}
		});
		System.out.println(ee);
		// long aa = ee.stream().map(x -> x.getGender()).count();
		Map<Object, Long> hi = ee.stream().collect(Collectors.groupingBy(x -> x.getGender(), Collectors.counting()));
		System.out.println(hi);
		long aa = ee.stream().filter(x -> x.getGender().equals("male") || x.getGender().equals("female")).count();
		System.out.println(aa);
	}
}
