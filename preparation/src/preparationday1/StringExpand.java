package preparationday1;

import java.util.Scanner;

public class StringExpand {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();

		StringBuffer output = new StringBuffer();
		int count = 0;
		char currentChar = ' ';
		for (int i = 0; i < input.length(); i++) {
			if (Character.isDigit(input.charAt(i))) {
				count = count * 10 + Character.getNumericValue(input.charAt(i));
			} else {
				for (int j = 0; j < count; j++) {
					output.append(currentChar);
				}
				count = 0;
				currentChar = input.charAt(i);
			}
		}

		for (int j = 0; j < count; j++) {
			output.append(currentChar);
		}

		System.out.println(output.toString());
	}
}
