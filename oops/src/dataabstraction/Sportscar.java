package dataabstraction;

public class Sportscar extends Car {
	public String brand() {
		return "maruti";
	}

	public String showroom() {
		return "chennai";
	}

	public void showroomDistence() {
		System.out.println("20 kms");
	}

	public int price() {
		return 2000000;
	}

	public String model() {
		return "swift";
	}

	public void cc(int a) {
		if (a > 200) {
			System.out.println("yes sports car");
		} else {
			System.out.println("no family car");
		}
	}
}
