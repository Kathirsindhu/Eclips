package constructor;

public class Tyre {
	private String brand;
	private int price;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Tyre [brand=" + brand + ", price=" + price + "]";
	}

	public Tyre(String brand, int price) {
		super();
		this.brand = brand;
		this.price = price;
	}

}
