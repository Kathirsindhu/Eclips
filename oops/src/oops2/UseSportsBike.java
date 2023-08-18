package oops2;

public class UseSportsBike {
	public static void main(String[] args) {
		SportsBike b1 = new SportsBike();
		b1.color = "white";
		b1.printBrand("yamaha");
		b1.year = 2011;
		b1.weight(152);
		b1.ccLevel("150");

		System.out.println(b1.color + b1.year + " ");
	}
}
