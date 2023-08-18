package stream;

public class Laptop {
	private String brand;
	private int price;
	private String oS;
	private int ram;
	private int rom;
	private int warranty;
	private String color;
	private String model;

	public String getoS() {
		return oS;
	}

	public void setoS(String oS) {
		this.oS = oS;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getOS() {
		return oS;
	}

	public void setOS(String oS) {
		this.oS = oS;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getRom() {
		return rom;
	}

	public void setRom(int rom) {
		this.rom = rom;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Laptop(String brand, int price, String oS, int ram, int rom, int warranty, String color, String model) {
		super();
		this.brand = brand;
		this.price = price;
		this.oS = oS;
		this.ram = ram;
		this.rom = rom;
		this.warranty = warranty;
		this.color = color;
		this.model = model;
	}

	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", price=" + price + ", oS=" + oS + ", ram=" + ram + ", rom=" + rom
				+ ", warranty=" + warranty + ", color=" + color + ", model=" + model + "]";
	}

}
