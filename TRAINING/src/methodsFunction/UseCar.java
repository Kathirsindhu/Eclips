package methodsFunction;

public class UseCar {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.brand = "maruti";
		c1.price = 200000;
		c1.taxPercentage = 5;
		c1.netPrice = c1.netPrice();
		c1.display();
		Car c2 = new Car();
		c2.brand = "maruti";
		c2.price = 300000;
		c2.taxPercentage = 5;
		c2.netPrice = c2.netPrice();
		c2.display();
	}
}
