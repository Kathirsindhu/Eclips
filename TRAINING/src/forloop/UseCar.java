package forloop;

public class UseCar {
	public static void main(String[] args) {
		Cars car1 = new Cars();
		car1.brand = "Maruti";
		car1.price = 100000;
		car1.colour = "Red";
		Cars car2 = new Cars();
		car2.price = 600000;
		car2.brand = "Hyundai";
		car2.colour = "white";
		Cars car3 = new Cars();
		car3.brand = "Datsun";
		car3.price = 900000;
		car3.colour = "Blue";
		Cars[] car = { car1, car2, car3 };
		int a = 0;
		Cars temp = car[0];
		for (int i = 0; i < car.length - 1; i++) {
			if (temp.price < car[i].price) {
				System.out.println(car[i].brand + " " + car[i].price + " " + car[i].colour);
			}
			a = a + car[i].price;
		}
		System.out.println(a);
	}

}
