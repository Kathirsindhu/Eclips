package methodsFunction;

public class Pen {
	String brnad;
	int price;
	int discount;
	int netPrice;

	public int maxPrice(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
}
