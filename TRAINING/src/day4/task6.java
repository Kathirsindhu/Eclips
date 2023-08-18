package day4;

public class task6 {
	public static void main(String[] arg) {
		String a = arg[0];
		String[] b = a.split("-");
		int c = Integer.parseInt(b[0]);
		int d = Integer.parseInt(b[1]);
		String e = b[2];
		boolean f = Boolean.parseBoolean(b[3]);
		long g = Long.parseLong(b[4]);
		System.out.println(a);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);

	}
}
