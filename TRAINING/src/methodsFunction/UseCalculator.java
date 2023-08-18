package methodsFunction;

public class UseCalculator {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		System.out.println(c1.findAddition());
		System.out.println(c1.findAddition(10, 20));

		c1.findAddition(10, 20);

	}
}
