package java8;

public class Association {
	public static void main(String[] args) {
		Calculation add = (a, b) -> (a + b);
		System.out.println(add.math(10, 15));
		Calculation sub = (a, b) -> (a - b);
		System.out.println(sub.math(15, 10));
		Calculation mil = (a, b) -> (a * b);
		System.out.println(mil.math(15, 10));
		Calculation div = (a, b) -> (a / b);
		System.out.println(div.math(15, 5));
		Calculation max = (a, b) -> {
			if (a > b) {
				return (a);
			} else {
				return (b);
			}

		};
		System.out.println(max.math(20, 10));

	}
}
