package methodsFunction;

public class UsePenArray {
	public static void main(String[] args) {
		PenArray p1 = new PenArray();
		p1.brand = "cello";
		p1.price = 15;
		p1.color = "blue";
		p1.discount = 2;
		PenArray p2 = new PenArray();
		p2.brand = "renolds";
		p2.price = 150;
		p2.color = "black";
		p2.discount = 3;
		PenArray p3 = new PenArray();
		p3.brand = "too";
		p3.price = 19;
		p3.color = "black";
		p3.discount = 5;
		int[] prices = { p1.price, p2.price, p3.price };
		int[] dis = { p1.discount, p2.discount, p3.discount };
		PenArray[] pens = { p1, p2, p3 };
		//System.out.println(p3.maxPrice(prices));
		//System.out.println(p3.discounts(dis));
		//System.out.println(p3.brands(pens));
		//p3.colour(pens);
		PenArray temp = p3.penP(pens);
		//System.out.println(temp.brand + " " + temp.price);
		p3.vowels(pens);

	}
}
