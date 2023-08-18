package methodsFunction;

public class Calculator {
	public int findAddition() {
		int a = 50;
		int b = 100;
		return a + b;
	}

	public float findAddition(int a, int b) {
		float c = 10.5f;
		return a + b + c;

	}

	public void findAddition(int a, float b) {
		System.out.println(a + b);
	}

}
