package day2;

public class ShritList {
	public static void main(String[] arg) {
		Shrit s1 = new Shrit();
		s1.brand = "allen solly";
		s1.price = 3000;
		s1.isCotton = true;
		s1.discountPercentage = 5;
		s1.netPrice = s1.price - ((s1.price * s1.discountPercentage) / 100);
		System.out.println(
				s1.brand + " " + s1.price + " " + s1.isCotton + " " + s1.discountPercentage + " " + s1.netPrice);
		Shrit s2 = new Shrit();
		s2.brand = "levis";
		s2.price = 4000;
		s2.isCotton = true;
		s2.discountPercentage = 8;
		s2.netPrice = s2.price - ((s2.price * s2.discountPercentage) / 100);
		System.out.println(
				s2.brand + " " + s2.price + " " + s2.isCotton + " " + s2.discountPercentage + " " + s2.netPrice);
		Shrit s3 = new Shrit();
		s3.brand = "indian terrain";
		s3.price = 3500;

		s3.discountPercentage = 9;
		s3.netPrice = s3.price - ((s3.price * s3.discountPercentage) / 100);
		System.out.println(
				s3.brand + " " + s3.price + " " + s3.isCotton + " " + s3.discountPercentage + " " + s3.netPrice);
		Shrit s4 = new Shrit();
		s4.brand = "allen solly";
		s4.price = 3000;
		s4.isCotton = true;
		s4.discountPercentage = 5;
		s1.netPrice = s1.price - ((s1.price * s1.discountPercentage) / 100);
		System.out.println(
				s1.brand + " " + s1.price + " " + s1.isCotton + " " + s1.discountPercentage + " " + s1.netPrice);
	}

}
