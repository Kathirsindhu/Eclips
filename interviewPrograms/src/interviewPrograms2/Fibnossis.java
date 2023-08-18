package interviewPrograms2;

public class Fibnossis {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int c = 1;
		int d = 0;
		for (int i = 0; i <= a; i++) {
			b = c;
			c = d;
			d = b + c;
			System.out.println(d);
		}
	}
}
