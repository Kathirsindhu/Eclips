package interviewPrograms2;

public class Removing {
	public static void main(String[] args) {
		String a = "abc123def";
		String b = a.substring(0, 3);
		String c = a.substring(3, 6);
		String d = a.substring(6, 9);
		System.out.println(b + " " + c + " " + d);
		char[] ch = c.toCharArray();
		System.out.println(ch);
		String e = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			if (ch[i] == '1') {
				continue;
			} else {
				e = e + ch[i];
			}
		}
		System.out.println(d + e + b);

	}
}
