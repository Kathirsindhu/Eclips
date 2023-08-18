package day2;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SampleMap {
	public static void main(String[] args) {
		Map<Integer, String> a = new ConcurrentHashMap();
		a.put(1, "kathir");
		a.put(2, "karthi");
		a.put(3, "vetri");
		for (String x : a.values()) {
			System.out.println(x);
		}
		for (String x : a.values()) {
			a.put(4, "bala");
			System.out.println(x);
		}
	}
}
