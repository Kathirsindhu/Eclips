package methodsFunction;

public class Numbers {
	int a;
	int b;
	int c;

	public int max() {
		if (a > b && a > c) {
			return a;
		} else if (b > a && b > c) {
			return b;
		} else {
			return c;
		}
	}
}
