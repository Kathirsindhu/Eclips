package java81;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class UseStudent {
	public static void main(String[] args) {
		Student s1 = new Student("kathir", 1, 19, 'a');
		Student s2 = new Student("karthi", 2, 17, 'b');
		Student s3 = new Student("vetri", 3, 15, 'c');
		Student s4 = new Student("kathir", 1, 19, 'a');
		List<Student> a = new ArrayList<>();
		a.add(s1);
		a.add(s2);
		a.add(s3);
		a.add(s4);
//		List<String> aaa = a.stream().map(x -> x.getName()).sorted().collect(Collectors.toList());
//		aaa.forEach(x -> System.out.println(x));
//		List<String> baa = a.stream().map(x -> x.getName()).sorted(Comparator.reverseOrder())
//				.collect(Collectors.toList());
//		baa.forEach(x -> System.out.println(x));
//		List<Integer> bba = a.stream().map(x -> x.getId()).distinct().limit(2).collect(Collectors.toList());
//		bba.forEach(x -> System.out.println(x));
		// System.out.println(a.stream().distinct().max(Comparator.comparing(Student::getAge)).get());
//		ArrayList<Integer> i = a.stream().map(x -> x.getAge()).max(Comparator.comparingInt(Student::getAge));
//		System.out.println(a.stream().distinct().min(Comparator.comparing(Student::getAge)).get());
//		int ab = a.stream().map(x -> x.getAge()).max(Comparable::compareTo).get();
//		System.out.println(ab);
//		Student sa = a.stream().distinct().sorted(Comparator.comparing(Student::getAge).reversed()).skip(1).findFirst()
//				.get();
//		System.out.println(sa);
//		boolean aba = a.stream().anyMatch(x -> x.getAge() == 17);
//		System.out.println(aba);
//		List<Integer> aaba = a.stream().map(x -> x.getAge()).collect(Collectors.toList());
//		int a1 = aaba.stream().collect(Collectors.summingInt(Integer::intValue));
//		System.out.println(a1);
//		
//		Map<Integer, List<Student>> a12 = a.stream().collect(Collectors.groupingBy(Student::getAge));
//		a12.forEach((x, y) -> {
//			System.out.println(x + " " + y);
//		});
//		
//		List<Integer> l1 = Arrays.asList(10, 20, 30);
//		List<Integer> l2 = Arrays.asList(40, 50, 60);
//		List<List<Integer>> nums = Arrays.asList(l1, l2);
//		List<Integer> result = nums.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
//		result.forEach(x -> System.out.println(x));

//		List<Integer> k = a.stream().map(x -> x.getId()).collect(Collectors.toList());
//		System.out.println(k);

//		Map<Integer, String> ka = a.stream().collect(Collectors.toMap(x -> x.getId(), y -> y.getName()));
//		ka.forEach((x, y) -> {
//			System.out.println(x + " " + y);
//		});

		Set<Student> kat = a.stream().distinct().collect(Collectors.toSet());
//		Set<String> kath = a.stream().map(x -> x.getName()).collect(Collectors.toSet());
//		System.out.println(kath);
 		System.out.println(kat);
	}
}
