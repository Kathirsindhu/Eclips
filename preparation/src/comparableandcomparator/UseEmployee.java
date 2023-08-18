package comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Arrays;
//import java.util.List;

public class UseEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee("kathir", 27, 150000);
		Employee e2 = new Employee("karthi", 26, 140000);
		Employee e3 = new Employee("vetri", 25, 130000);
		Employee e4 = new Employee("bala", 24, 120000);
		Employee e5 = new Employee("sreeni", 23, 110000);
		// List<Employee> empl = Arrays.asList(e1,e2,e3,e4,e5);
		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		// Collections.sort(emp);
		// emp.forEach(x -> System.out.println(x));
		// Collections.sort(emp, new SalarySory());
		// emp.forEach(x -> System.out.println(x));
		Collections.sort(emp, new AgeSort());
		emp.forEach(x -> System.out.println(x));
	}
}
