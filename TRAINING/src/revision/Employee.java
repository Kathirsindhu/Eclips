package revision;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
	String gender;
	int age;
	int salary;

	public Employee(String gender, int age, int salary) {
		super();
		this.gender = gender;
		this.age = age;
		this.salary = salary;
	}

	public List<Employee> getEmplooyebySalary(int salary, ArrayList<Employee> lis) {
		return lis.stream().filter((x) -> x.getSalary() > salary).collect(Collectors.toList());
	}

	public List<Employee> getEmployeeGender(String gender, ArrayList<Employee> aaa) {
		return aaa.stream().filter((x) -> x.getGender().equalsIgnoreCase(gender)).collect(Collectors.toList());
	}

	public List<Employee> getEmployeeAge(int age, ArrayList<Employee> eee) {
		return eee.stream().filter((x) -> x.getAge() > age).collect(Collectors.toList());
	}

	@Override
	public String toString() {
		return "Employee [gender=" + gender + ", age=" + age + ", salary=" + salary + "]";
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
