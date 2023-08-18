package revision;

public class UseAc {
	public static void main(String[] arg) {
		Ac ac1 = new Ac();
		ac1.brand = "heir";
		ac1.price = 25000;
		ac1.isQuality = true;
		ac1.discount = 5000;
		ac1.netPrice = ac1.price - ac1.discount;
		System.out.println("brand = " + ac1.brand + " " + ", price = " + ac1.price + " " + ", is Quality = "
				+ ac1.isQuality + " ," + "discount = " + ac1.discount + ", netprice = " + ac1.netPrice);
		Ac ac2 = new Ac();
		ac2.brand = "voltas";
		ac2.price = 25000;
		ac2.isQuality = true;
		ac2.discount = 3000;
		ac2.netPrice = ac2.price - ac2.discount;
		System.out.println("brand = " + ac2.brand + " " + ", price = " + ac2.price + " " + ", is Quality = "
				+ ac2.isQuality + " , " + "discount = " + ac2.discount + ", netprice = " + ac2.netPrice);
		Ac ac3 = new Ac();
		ac3.brand = "croma";
		ac3.price = 30000;
		ac3.isQuality = true;
		ac3.discount = 4000;
		ac3.netPrice = ac3.price - ac3.discount;
		System.out.println("brand = " + ac3.brand + " " + ", price = " + ac3.price + " " + ", is Quality = "
				+ ac3.isQuality + " " + ", discount = " + ac3.discount + ", netprice = " + ac3.netPrice);
		Ac ac4 = new Ac();
		System.out.println(ac4.temp(18));
		System.out.println(ac4.net(ac2.price, 2500));
		System.out.println(ac4.tempmini(18));
		ac1.printAc();
		ac2.printAc();
		ac3.printAc();

	}

}
