package revision;

public class Ac {
	String brand;
	int price;
	boolean isQuality;
	int discount;
	int netPrice;

	public int temp(int a) {
		return a += 1;

	}

	public int net(int a, int b) {
		return a - b;
	}

	public int tempmini(int b) {
		return b -= 1;
	}
	
	public void printAc() {
		System.out.println("brand = " + brand + ", price = " + price + ", discount = " + discount + ", netprice = " + netPrice);
	}
} 