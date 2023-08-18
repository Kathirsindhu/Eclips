package constructor;

public class Engine {
	@Override
	public String toString() {
		return "Engine [price=" + price + ", piston=" + piston + "]";
	}

	int price;
	int piston;

	public void setPrice(int price) {
		this.price = price;

	}

	public void setPiston(int piston) {
		this.piston = piston;

	}

	public int getPrice() {
		return price;
	}

	public int getPiston() {
		return piston;
	}

	public Engine(int price, int piston) {
		this.price = price;
		this.piston = piston;
	}
}
