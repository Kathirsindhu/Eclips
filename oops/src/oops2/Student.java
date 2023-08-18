package oops2;

public class Student {
	private int id;
	private String name;

	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String toString() {
		return "nema " + name + ", id: " + id;
	}
}
