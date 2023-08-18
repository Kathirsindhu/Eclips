package comparableandcomparator;

import java.util.Comparator;

public class SalarySory implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		// return e1.getSalary() - e2.getSalary();
		return e2.getSalary() - e1.getSalary();
	}
}
