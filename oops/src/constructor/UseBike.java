package constructor;

public class UseBike {
	public static void main(String[] args) {
		Engine e1 = new Engine(5000, 2);
		Tyre t1 = new Tyre("mrf", 350);
		Tyre t2 = new Tyre("ceat", 300);
		Tyre t3 = new Tyre("mrf2", 250);
		Tyre t4 = new Tyre("ceat2", 200);
		Tyre[] tyres = { t1, t2, t3, t4 };
		Bike b1 = new Bike("r1", 2000000, "blue", e1, tyres);
		// System.out.println(b1.getBrand() + " " + b1.getColor() + " " +
		// b1.getPrice());
		// System.out.println(b1.getEngine().getPiston() + " " +
		// b1.getEngine().getPrice());
		System.out.println(b1);
	}
}
