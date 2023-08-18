package forloop;

public class SecHalf {
	public static void main(String[] args) {
		String a = "onesoft";
		for (int i = a.length() / 2; i < a.length(); i++) {
			System.out.println(a.charAt(i));
		}
	}
}
