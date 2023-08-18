package dataabstraction;

public abstract class Bus implements Transport {
	public String brand() {
		return "Benz";
	}

	public int fare(int a) {
		if (a > 0 && a <= 10) {
			return 10;
		} else {
			return 20;
		}
	}

	public String board() {
		return "TamilnaduState";
	}
}
