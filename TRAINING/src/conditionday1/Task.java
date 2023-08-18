package conditionday1;

import java.util.Scanner;

public class Task {
	public static void main(String[] arg) {
		try (Scanner s = new Scanner(System.in)) {
			int a = s.nextInt();
			int b = s.nextInt();
			if (a > b) {
				System.out.println(a + "  is largest number");
			} else {
				System.out.println(b + " is largest number");
			}
		}
	}

}
