package kkk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Country {
	private String name;

	Country(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}
}

public class CollClient {

	public static void main(String[] str) {
		HashSet myMap = new HashSet();
		String s1 = new String("India");
		String s2 = new String("India");
		Country s3 = new Country("France");
		Country s4 = new Country("France");
		myMap.add(s1);
		myMap.add(s2);
		myMap.add(s3);
		myMap.add(s4);
		System.out.println(myMap);
	}
}
