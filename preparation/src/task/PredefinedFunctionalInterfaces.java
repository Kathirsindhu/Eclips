package task;

import java.util.function.*;

public class PredefinedFunctionalInterfaces {
	public static void main(String[] args) {
		// Function<T, R>
		Function<Integer, String> intToString = num -> "Number: " + num;
		System.out.println(intToString.apply(42)); // Output: Number: 42

		// Predicate<T>
		Predicate<String> isLengthGreaterThanFive = str -> str.length() > 5;
		System.out.println(isLengthGreaterThanFive.test("Hello")); // Output: false
		System.out.println(isLengthGreaterThanFive.test("Goodbye")); // Output: true

		// Consumer<T>
		Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
		printUpperCase.accept("hello"); // Output: HELLO

		// Supplier<T>
		Supplier<Integer> randomNumberSupplier = () -> (int) (Math.random() * 100);
		System.out.println(randomNumberSupplier.get()); // Output: (random integer between 0 and 100)

		// UnaryOperator<T>
		UnaryOperator<Integer> square = num -> num * num;
		System.out.println(square.apply(5)); // Output: 25

		// BiFunction<T, U, R>
		BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
		System.out.println(add.apply(3, 7)); // Output: 10

		// BiPredicate<T, U>
		BiPredicate<Integer, Integer> isSumEven = (a, b) -> (a + b) % 2 == 0;
		System.out.println(isSumEven.test(2, 3)); // Output: true

		// BiConsumer<T, U>
		BiConsumer<String, Integer> printRepeatedString = (str, count) -> {
			for (int i = 0; i < count; i++) {
				System.out.print(str);
			}
			System.out.println();
		};
		printRepeatedString.accept("Java ", 3); // Output: Java Java Java

		// BinaryOperator<T>
		BinaryOperator<Integer> multiply = (a, b) -> a * b;
		System.out.println(multiply.apply(4, 5)); // Output: 20
	}
}
