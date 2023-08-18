package forloop;

public class StringReverse {
	public static void main(String[] args) {
		String a = "onesoft";
		for (int i = a.length() - 1; i >= 0; i--) {
			System.out.println(a.charAt(i));
		}
		char[] b = a.toCharArray();
		for (int i = a.length() - 1; i >= 0; i--) {
			System.out.println(b[i]);
		}
	}
}
