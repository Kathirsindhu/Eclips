package java81;

import java.util.Arrays;
import java.util.List;

public class UseSample3 {
	public static void main(String[] args) {
		Sample3 s = (a) -> {
			for (String x : a) {
				if (x.contains("a") || x.contains("e") || x.contains("i") || x.contains("o") || x.contains("u")) {
					// System.out.println("the word contains vowels");
					continue;
				} else {
					System.out.println(x);
				}
			}
//*****it is used in string array*****
//			for (int i = 0; i < a.; i++) { 
//
//				if (a[i].contains("a") || a[i].contains("e") || a[i].contains("i") || a[i].contains("o")
//						|| a[i].contains("u")) {
//					// System.out.println("the word contains vowels");
//					continue;
//				} else {
//					System.out.println(a[i]);
//				}
//*****************************************************************
		};
		// String[] aa = { "fly", "fry", "hai", "hello" };
		List<String> a = Arrays.asList("fly", "fry", "hai", "hello");
		s.findConsonants(a);
	}
}
