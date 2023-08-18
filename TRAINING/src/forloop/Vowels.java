package forloop;

public class Vowels {
	public static void main(String[] args) {
		String a = "hello";
		for (int i = 0; i < a.length(); i++) {
			if (a.contains("a") || a.contains("e") || a.contains("i") || a.contains("o") || a.contains("u")) {
				System.out.println(a.charAt(i));
			}
		}
	}
}
