package forloop;

public class UsingCondition {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		for (int i = 1; i < 10; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}

		}
	}
}
