package java8;

public class Hyundai {
	static String brand;
	private String color;
	private int price;

	public Hyundai(String color, int price) {
		super();
		this.color = color;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Hyundai [color=" + color + ", price=" + price + "]";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
