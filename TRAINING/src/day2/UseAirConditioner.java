package day2;

public class UseAirConditioner {
	public static void main(String[] arg) {
		AirConditioner a1 = new AirConditioner();
		a1.brand = "voltas";
		a1.price = 45000;
		a1.colour = "white";
		a1.tax = 5000;
		a1.netPrice = a1.price + a1.tax;
		System.out.println(a1.brand + " \n" + a1.price + " \n" + a1.colour + " \n" + a1.tax + " \n" + a1.netPrice);
		AirConditioner a2 = new AirConditioner();
		a2.brand = "heir";
		a2.price = 35000;
		a2.colour = "white";
		a2.tax = 4000;
		a2.netPrice = a2.price + a2.tax;
		System.out.println(a2.brand + " " + a2.price + " " + a2.colour + " " + a2.tax + " " + a2.netPrice);
		AirConditioner a3 = new AirConditioner();
		a3.brand = "mitsubishi";
		a3.price = 35000;
		a3.colour = "white";
		a3.tax = 4000;
		a3.netPrice = a3.price + a3.tax;
		System.out.println(a3.brand + " " + a3.price + " " + a3.colour + " " + a3.tax + " " + a3.netPrice);
		AirConditioner a4 = new AirConditioner();
		a4.brand = "heir";
		a4.price = 35000;
		a4.colour = "white";
		a4.tax = 4000;
		a4.netPrice = a4.price + a4.tax;
		System.out.println(a4.brand + " " + a4.price + " " + a4.colour + " " + a4.tax + " " + a4.netPrice);
	}

}
