package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseHyundai {
	public static void main(String[] args) {
		Hyundai h1 = new Hyundai("blck", 1000);
		h1.brand = "brand1";
		Hyundai h2 = new Hyundai("whitw", 2001);
		h2.brand = "brand2";
		Hyundai h3 = new Hyundai("red", 3000);
		h3.brand = "brand3";
		Hyundai h4 = new Hyundai("blue", 4001);
		h4.brand = "brand4";
		Hyundai h5 = new Hyundai("yellow", 5000);
		h5.brand = "brand5";
		ArrayList<Hyundai> hh = new ArrayList<>();
		hh.add(h1);
		hh.add(h2);
		hh.add(h3);
		hh.add(h4);
		hh.add(h5);
		hh.forEach((x) -> {
			if (x.getPrice() % 2 == 0) {
				System.out.println(x.getPrice());
			}
		});
		List<Hyundai> aa = hh.stream().filter((x) -> x.getColor().equalsIgnoreCase("red")).collect(Collectors.toList());
		System.out.println(aa.toString());

	}
}
