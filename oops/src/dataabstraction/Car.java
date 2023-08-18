package dataabstraction;

public abstract class Car implements Vehicle {
	abstract int price();

	abstract String model();

	public int year(int a) {
		return 2023 - a;
	}
}
