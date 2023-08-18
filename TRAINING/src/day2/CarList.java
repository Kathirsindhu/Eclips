package day2;

public class CarList {
	public static void main(String[] arg) {
		Car c1 = new Car();
		c1.brand = "dezire";
		c1.price = 700000;
		c1.colour = "black";
		c1.tax = 25000;
		c1.ispetrol = true;
		c1.netprice = c1.price + c1.tax;
		System.out.println(
				c1.brand + " " + c1.price + " " + c1.colour + " " + c1.tax + " " + c1.ispetrol + " " + c1.netprice);
		Car c2 = new Car();
		c2.brand = "ciaz";
		c2.price = 1700000;
		c2.colour = "white";
		c2.tax = 125000;
		c2.ispetrol = true;
		c2.netprice = c2.price + c2.tax;
		System.out.println(
				c2.brand + " " + c2.price + " " + c2.colour + " " + c2.tax + " " + c2.ispetrol + " " + c2.netprice);
		Car c3 = new Car();
		c3.brand = "Grandi10";
		c3.price = 500000;
		c3.colour = "blue";
		c3.tax = 20000;
		c3.ispetrol = true;
		c3.netprice = c3.price + c3.tax;
		System.out.println(
				c3.brand + " " + c3.price + " " + c3.colour + " " + c3.tax + " " + c3.ispetrol + " " + c3.netprice);
		Car c4 = new Car();
		c4.brand	=	"thar";
		c4.price	=	160000;
		c4.colour	=	"black";
		c4.tax 		=	75000;
		c4.ispetrol = true;
		c4.netprice = c4.price + c4.tax;
		System.out.println(
				c4.brand + " " + c4.price + " " + c4.colour + " " + c4.tax + " " + c4.ispetrol + " " + c4.netprice);
		

	}

}
