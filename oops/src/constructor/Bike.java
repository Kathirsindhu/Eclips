package constructor;

import java.util.Arrays;

public class Bike {
	private String brand;
	private int price;
	private String color;
	private Engine engine;
	private Tyre[] tyre;

	public Bike(String brand, int price, String color, Engine engine, Tyre[] tyre) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.engine = engine;
		this.tyre = tyre;
	}

	public Tyre[] getTyre() {
		return tyre;
	}

	public void setTyre(Tyre[] tyre) {
		this.tyre = tyre;
	}

	public void setBrand(String brand) {
		this.brand = brand;

	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;

	}

	public int getPrice() {
		return price;

	}

	public String getColor() {
		return color;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Engine getEngine() {
		return engine;
	}

	@Override
	public String toString() {
		return "Bike [brand=" + brand + ", price=" + price + ", color=" + color + ", engine=" + engine + ", tyre="
				+ Arrays.toString(tyre) + "]";
	}
}
