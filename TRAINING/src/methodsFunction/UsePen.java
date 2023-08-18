package methodsFunction;

public class UsePen {
	public static void main(String[] args) {
		Pen p1 = new Pen();
		p1.brnad = "cello";
		p1.price = 10;
		p1.discount = 2;
		Pen p2 = new Pen();
		p2.brnad = "renolds";
		p2.price = 15;
		p2.discount = 2;
		System.out.println(p1.maxPrice(p1.price, p2.price));

	}
}
