package java81;

import java.util.Optional;

public class optionsll {
	public static void main(String[] args) {
		String v1 = null;
		Optional<String> va1 = Optional.ofNullable(v1);
		// Optional<String> va1 = Optional.of(v1);
		// if (va1.isPresent()) {
		if (va1.isEmpty()) {
			System.out.println(va1.get());

		} else {
			System.out.println("presented null");
		}
		// va1.orElse("the null is ");
		// va1.orElseThrow(()-> new NumberFormatException());
	}
}
