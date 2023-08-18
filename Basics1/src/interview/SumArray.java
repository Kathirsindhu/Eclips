package interview;

import java.util.Scanner;

public class SumArray {
	public static void main(String[] args) {
//		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
//		int b = 0;
//		for (int i = 0; i < a.length; i++) {
//			b = b + a[i];
//		}
//		System.out.println(b);
		Scanner s = new Scanner(System.in);
		System.out.println("enter size of array");
		int a = s.nextInt();
		int[] b = new int[a];
		System.out.println("enter " + a + " numbers");
		for (int i = 0; i < b.length; i++) {
			b[i] = s.nextInt();
		}
		int c = 0;
		for (int i = 0; i < b.length; i++) {
			c = c + b[i];
		}
		System.out.println("the sum of array is " + c);
	}
}
