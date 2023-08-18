package day2;

import java.util.Hashtable;

public class HashTable {
	public static void main(String[] args) {
		Hashtable<Integer, String> val = new Hashtable<>();
		val.put(101, "kathir");
		val.put(105, "vetri");
		val.put(108, "karthi");
		val.put(109, "muthu");
		for (Integer x : val.keySet()) {
			System.out.println(x.hashCode() % 11 + " " + val.get(x));
		}
	}
}
