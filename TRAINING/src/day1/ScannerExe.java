package day1;

import java.util.Scanner;

public class ScannerExe {
	public static void main(String[] arg) {
		try (Scanner s = new Scanner(System.in)) {
			int num1 = s.nextInt();
			int num2 = s.nextInt();
			int answer = (num1 * num2) / 100;
			int finalanswer = answer + num1;

			System.out.println("the first number is " + num1);
			System.out.println("the percentage value is " + num2 + "%");
			System.out.println("the addition of " + num2 + "% of " + "" + num1 + "with " + num1  +" " + finalanswer);
		}

	}
}