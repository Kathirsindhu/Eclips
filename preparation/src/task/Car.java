package task;

public class Car {
	public static Car a = null;
	String brand;
	int price;
	int model;

	private Car() {

	}

	public static Car getSingleton() {
		if (a == null) {
			a = new Car();
		}
		return a;
	}

	public String toString() {
		return brand + " " + price + " " + model;
	}
}
