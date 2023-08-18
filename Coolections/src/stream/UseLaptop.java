package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseLaptop {
	public static void main(String[] args) {
		Laptop l1 = new Laptop("dell", 10000, "linux", 8, 1000, 1, "black", "a");
		Laptop l2 = new Laptop("hp", 15000, "windows", 12, 2000, 2, "white", "b");
		Laptop l3 = new Laptop("lenova", 20000, "linux", 8, 1500, 1, "black", "c");
		Laptop l4 = new Laptop("acer", 25000, "window", 8, 1000, 1, "white", "d");
		Laptop l5 = new Laptop("samsung", 10000, "linux", 12, 1000, 2, "black", "e");
		Laptop l6 = new Laptop("apple", 20000, "ios", 8, 1000, 1, "white", "f");
		ArrayList<Laptop> lap = new ArrayList<>();
		lap.add(l1);
		lap.add(l2);
		lap.add(l3);
		lap.add(l5);
		lap.add(l4);
		lap.add(l6);
		List<Laptop> kk = lap.stream().filter((x) -> x.getColor().equalsIgnoreCase("white"))
				.collect(Collectors.toList());
		kk.forEach((x) -> System.out.println(x));
		List<String> brands = lap.stream().filter((x) -> x.getColor().equalsIgnoreCase("white"))
				.map((x) -> x.getBrand()).collect(Collectors.toList());
		System.out.println(brands);
		Map<String, Laptop> kkk = lap.stream().filter((x) -> x.getPrice() >= 20000)
				.collect(Collectors.toMap((x) -> x.getModel(), (y) -> y));
		for (String va : kkk.keySet()) {

			System.out.println(va);
		}
	}
}
