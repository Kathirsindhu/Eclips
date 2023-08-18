package oops2;

public class Teacher extends Employee {
	private String natives;
	private int distance;

	public Teacher(String name, int id, String natives, int distance) {
		super(name, id);
		this.natives = natives;
		this.distance = distance;
	}

	public String toString() {
		return super.toString() + " from:" + natives + ", distance: " + distance;
	}
}
