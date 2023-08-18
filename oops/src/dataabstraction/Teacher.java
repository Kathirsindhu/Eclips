package dataabstraction;

public class Teacher implements Human {
	public String name(String n) {
		return n.toUpperCase();
	}

	public int age(int a) {
		return 2023 - a;
	}

	public void gender() {
		System.out.println("male");
	}
}
