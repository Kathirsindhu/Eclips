package oops2;

public class UseStationaryProducts {
	public static void main(String[] args) {
		Pen p1 = new Pen();
		p1.penBrand = "cello";

		System.out.println(p1.quality(180) + p1.netPrice(160) + " " + p1.price);
	}
}
