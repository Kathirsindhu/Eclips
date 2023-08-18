package java8;

public class UseAge {
	public static void main(String[] args) {
		Age age = (a) -> {
			if (a >= 18) {
				return ("eligible for voting");
			} else {
				return ("not eligible for voting");
			}
		};
		System.out.println(age.age(17));
		Age age1 = (a) -> {
			if (a >= 25) {
				return ("eligible for election");
			} else {
				return ("not eligible for election");
			}
		};
		System.out.println(age1.age(25));
	}
}
