package java81;

public class UseSample {
	public static void main(String[] args) {
		Sample s = (a, b) -> {
			if (a > b) {
				System.out.println(a + " is high");
			} else {
				System.out.println(b + " is high");
			}
		};
		s.findHigh(10, 20);
	}
}
