package methodsFunction;

public class Car {
	String brand;
	int price;
	int taxPercentage;
	int netPrice;

	public int netPrice() {
		return price + (price * taxPercentage / 100);
	}

	public void display() {
		System.out.println(brand + " " + netPrice);
	}
}
