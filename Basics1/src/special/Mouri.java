package special;

public class Mouri {
	public static void main(String[] args) {
		String a = "abc123@#$";
		String b = "";
		String c = "";
		String d = "";
		for (Character x : a.toCharArray()) {
			if (Character.isAlphabetic(x)) {
				b = b + x;
			} else if (Character.isDigit(x)) {
				c = c + x;
			} else {
				d = d + x;
			}
		}
		System.out.println(d);
	}
}
