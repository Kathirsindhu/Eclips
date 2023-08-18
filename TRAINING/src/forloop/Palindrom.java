package forloop;

public class Palindrom {
	public static void main(String[] args) {
		String a = args[0];
		String b = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			b = b + a.charAt(i);
		}
		if (b.equals(b)) {
			System.out.println(b + " Given word is palindrome");
		} else {
			System.out.println(b + " given word is not palindrome");
		}
	}
}
