package special;

import java.util.HashMap;
import java.util.Map;

public class Practice {
	public static void main(String[] args) {
		int number = 123;
		int originalNumber = number;
		int digits = 0;
		int temp = number;
		System.out.println(digits+ " "+temp+" "+number+" "+originalNumber);
		while (temp > 0) {
			temp /= 10;
			digits++;
		}
		System.out.println(digits+ " "+temp+" "+number+" "+originalNumber);
	}
}
