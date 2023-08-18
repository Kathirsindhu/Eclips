package forloop;

public class Fibnossis {
	public static void main(String[] args) {
		int a = 13;
		int d = 0;
		int b = 1;
		int c = 0;
		for (int i = 0; i <= a; i++) {
			d = b;
			b = c;
			c = d + b;
		
		System.out.println(d);
		}
	}
}
