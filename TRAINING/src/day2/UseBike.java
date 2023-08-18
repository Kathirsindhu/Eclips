package day2;

public class UseBike {
	public static void main(String[] arg) {
		Bike b1 = new Bike();
		b1.brand = "r15";
		b1.price = 180000;
		b1.colour = "blue";
		b1.cc = 155;
		b1.discountAmount = 10000;
		b1.netprice = b1.price - b1.discountAmount;
		System.out.println(b1.brand + " " + b1.price + " " + b1.colour + " " + b1.cc + " " + b1.discountAmount + " "
				+ b1.netprice);
		Bike b2 = new Bike();
		b2.brand = "royal enfield";
		b2.price = 210000;
		b2.colour = "white";
		b2.cc = 350;
		b2.discountAmount = 20000;
		b2.netprice = b2.price - b2.discountAmount;
		System.out.println(b2.brand + " " + b2.price + " " + b2.colour + " " + b2.cc + " " + b2.discountAmount + " "
				+ b2.netprice);
		Bike b3 = new Bike();
		b3.brand = "pulsar150";
		b3.price = 120000;
		b3.colour = "blue";
		b3.cc = 150;
		b3.discountAmount = 10000;
		b3.netprice = b3.price - b3.discountAmount;
		System.out.println(b3.brand + " " + b3.price + " " + b3.colour + " " + b3.cc + " " + b3.discountAmount + " "
				+ b3.netprice);
		Bike b4 = new Bike();
		b4.brand = "tvs apache";
		b4.price = 180000;
		b4.colour = "blue";
		b4.cc = 155;
		b4.discountAmount = 10000;
		b4.netprice = b4.price - b4.discountAmount;
		System.out.println(b4.brand + " " + b4.price + " " + b4.colour + " " + b4.cc + " " + b4.discountAmount + " "
				+ b4.netprice);
	}

}
