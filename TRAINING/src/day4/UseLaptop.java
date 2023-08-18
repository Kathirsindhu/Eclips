package day4;

public class UseLaptop {
	public static void main(String[] arg) {
		Laptop l1 = new Laptop();
		String[] a = arg[0].split(",");
		l1.brand = a[0];
		l1.price = Integer.parseInt(a[1]);
		l1.color = a[2];
		System.out.println(l1.brand.toUpperCase());
		Laptop l2 = new Laptop();
		String[] b = arg[1].split(",");
		l2.brand = b[0];
		l2.price = Integer.parseInt(a[1]);
		l2.color = b[2];
		System.out.println(l2.brand.toUpperCase());
		Laptop l3 = new Laptop();
		String c[] = arg[2].split(",");
		l3.brand = c[0];
		l3.price = Integer.parseInt(c[1]);
		l3.color = c[2];
		System.out.println(l3.brand.toUpperCase());	

	}

}
