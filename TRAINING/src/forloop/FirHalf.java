package forloop;

public class FirHalf {
	public static void main(String[] args) {
		String a = "onesoft";
		for (int i = 0; i < a.length() / 2; i++) {
			System.out.println(a.charAt(i));
		}
		for (int i = a.length() / 2; i >= 0; i--) {
			System.out.println(a.charAt(i));
		}
	}
}
