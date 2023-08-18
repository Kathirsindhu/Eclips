package preparationday1;

public class palindrom {
	public static void main(String[] args) {
		String a = "madam";
		String b = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			b = b + a.charAt(i);
		}
		if (a.equals(b)) {
			System.out.println("given string is palindrome");
		} else {
			System.out.println("given is not a palindrom");
		}
	}

}
