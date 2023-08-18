package day2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SampleList {
	public static void main(String[] args) {

		List<String> names = new CopyOnWriteArrayList();
		names.add("kathir");
		names.add("karthi");
		names.add("kathir");
		names.add("sindhu");
		for (String x : names) {
			names.add("bala");
		}
		names.forEach(x -> System.out.println(x));
	}
}
