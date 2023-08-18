package task;

import java.util.Optional;

public class Test2 {
	public static void main(String[] args) {
		String a = null;
//		Optional<String> aa = Optional.of(a);
//		System.out.println(aa);
		Optional<String> ab = Optional.ofNullable(a);
		System.out.println(ab);
		if (ab.isPresent()) {
			System.out.println("its not a null");
		} else if (ab.isEmpty()) {
			System.out.println("its a null");
		}
		ab.orElse("No null");
		ab.orElseThrow(() -> new NumberFormatException("number exception"));
	}
}
