package interview;

public class StringLength {

	public static void main(String[] args) {
		String string = "Hello, world!";

		// Initialize a variable to store the length of the string
		int length = 0;

		// Iterate through the string and increment the length variable for each
		// character
		for (char c : string.toCharArray()) {
			length++;
		}

		// Print the length of the string
		System.out.println("The length of the string is: " + length);
	}
}
