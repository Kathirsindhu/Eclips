package stream;

public class Car {
	private String brand;
	private int price;
	private String color;
	private int rating;
	private String model;
	private String noPlate;
	private String fuelType;

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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getNoPlate() {
		return noPlate;
	}

	public void setNoPlate(String noPlate) {
		this.noPlate = noPlate;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public Car(String brand, int price, String color, int rating, String model, String noPlate, String fuelType) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.rating = rating;
		this.model = model;
		this.noPlate = noPlate;
		this.fuelType = fuelType;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + ", color=" + color + ", rating=" + rating + ", model="
				+ model + ", noPlate=" + noPlate + ", fuelType=" + fuelType + "]";
	}

}
