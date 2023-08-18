package constructor;

public class Pen {
	private String brand;
	private int price;

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;

	}

	public int getPrice() {
		return price;
	}

	public Pen(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}

	public String toString() {
		return "Brand " + brand + " Pric=" + price;
	}
}
