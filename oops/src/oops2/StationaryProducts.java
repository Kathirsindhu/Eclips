package oops2;

public class StationaryProducts {
	int price;
	String productName;
	int netPrice;

	public int netPrice(int price) {
		return price + (price * 10 / 100);

	}
}
