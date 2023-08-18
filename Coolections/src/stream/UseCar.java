package stream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseCar {
	public static void main(String[] args) {
		Car c1 = new Car("ford", 100000, "violet", 5, "aa", "tn01", "petrol");
		Car c2 = new Car("tata", 200000, "green", 4, "bb", "tn02", "diesel");
		Car c3 = new Car("mahindra", 300000, "indigo", 3, "cc", "tn03", "petrol");
		Car c4 = new Car("kia", 400000, "blue", 2, "dd", "tn04", "diesel");
		Car c5 = new Car("honda", 500000, "yellow", 1, "ee", "tn05", "petrol");
		Car c6 = new Car("ford", 600000, "orange", 0, "ff", "tn06", "diesel");
		Car c7 = new Car("benz", 700000, "red", 6, "gg", "tn07", "petrol");
		HashMap<String, Car> cars = new HashMap<>();
		cars.put(c1.getModel(), c1);
		cars.put(c2.getModel(), c2);
		cars.put(c3.getModel(), c3);
		cars.put(c4.getModel(), c4);
		cars.put(c5.getModel(), c5);
		cars.put(c6.getModel(), c6);
		cars.put(c7.getModel(), c7);
		Map<String, Car> kk = cars.values().stream().filter((x) -> x.getPrice() > 100000 && x.getPrice() < 300000)
				.collect(Collectors.toMap((x) -> x.getNoPlate(), y -> y));
		kk.values().forEach(x -> System.out.println(x));
		List<Car> kkk = cars.values().stream()
				.filter((x) -> x.getFuelType().equalsIgnoreCase("petrol") && x.getPrice() > 400000)
				.collect(Collectors.toList());
		kkk.forEach(x -> System.out.println(x));
	}
}
