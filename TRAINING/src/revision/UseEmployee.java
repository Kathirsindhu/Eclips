package revision;

import java.util.ArrayList;
import java.util.List;

public class UseEmployee {
	public static void main(String[] args) {
		Employee s = new Employee("male", 35, 15000);
		Employee s1 = new Employee("female", 40, 20000);
		Employee s2 = new Employee("male", 45, 25000);
		Employee s3 = new Employee("female", 50, 50000);
		ArrayList<Employee> lis = new ArrayList<>();
		lis.add(s);
		lis.add(s1);
		lis.add(s2);
		lis.add(s3);
		List<Employee> kk = s3.getEmployeeGender("female", lis);
		
		// System.out.println(s.getEmplooyebySalary(20000, lis).toString());
		// System.out.println(s1.getEmployeeAge(35, lis));
		// System.out.println(s2.getEmployeeGender("male", lis));
		s2.getEmployeeAge(35, lis).forEach((x) -> System.out.println(x));

	}
}
