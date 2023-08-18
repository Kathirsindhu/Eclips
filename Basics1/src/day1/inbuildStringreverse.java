package day1;

public class inbuildStringreverse {
	public static void main(String[] args) {
		String a = "kathir";

		StringBuffer name = new StringBuffer(a);
		System.out.println(name.append(" avan"));
		System.out.println(name.reverse());

		StringBuilder n = new StringBuilder(a);

		System.out.println(n.append(" avan"));
		System.out.println(n.reverse());
		System.out.println(n);

	}
}
