package task;

import java.util.function.*;

public class Test {
	public static void main(String[] args) {
		Function<Integer, String> hai = num -> "Number: " + num;
		System.out.println(hai.apply(42));

		Consumer<String> hai1 = str -> System.out.println(str.toUpperCase());
		hai1.accept("kathir");

		Supplier<Integer> hai2 = () -> (int) (Math.random() * 100) + 1;
		System.out.println(hai2.get());

		Predicate<String> hais = str -> str.equals(str.toLowerCase());
		System.out.println(hais.test("kathir"));

	}
}
