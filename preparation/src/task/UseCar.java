package task;

public class UseCar {
	public static void main(String[] args) {
		Car c1 = Car.getSingleton();
		c1.brand = "toyoto";
		c1.price = 125000;
		c1.model = 2012;
		Car c2 = Car.getSingleton();
		c2.brand = "audi";
		c2.price = 12000;
		c2.model = 2023;
		Car c3 = Car.getSingleton();
		c3 = null;
		System.out.println(c1 + " " + c2 + " " + c3);
	}
}
