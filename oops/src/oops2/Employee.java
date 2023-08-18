package oops2;

public class Employee {
	private int id;
	private String name;

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String toString() {
		return "Name: " + name + " id:" + id;
	}

}
